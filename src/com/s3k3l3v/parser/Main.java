package com.s3k3l3v.parser;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String qry = "SELECT s.NN id,\n" +
            "       s.NAME title,\n" +
            "       s.NN article,\n" +
            "       s.CODGGR brend,\n" +
            "       975 group_id  \n" +
            "  FROM GASTELLO.CAT_SKLALL s\n" +
            "  WHERE s.AT_SITE = 1\n" +
            "    AND s.TYPE_ID IS NOT NULL\n" +
            "  AND s.NN > 0\n" +
            "  ORDER BY 4, 2\n";

    public static void main(String[] args) {
        createJSONFile("products");
    }

    public static void createJSONFile(String namedJSONFile){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.10.56:1521:ora112", "gastello", "gjkysqgbpltw");
            System.out.println("Connection Established "+ con);

            st = con.createStatement();
            rs = st.executeQuery(qry);

            JSONObject jObj = new JSONObject();

            ArrayList<Products> list = new ArrayList<Products>();
//            ArrayList<TableCategories> list = new ArrayList<TableCategories>();
            Products products = null;
            TableCategories tableCategories = null;

//            ArrayList<ProductId> list = new ArrayList<ProductId>();
//            ProductId productId = null;

            Ueba ueba = null;
//            List<Ueba> list = new ArrayList<Ueba>();
            Map<String, Integer> map = new HashMap<String, Integer>();

//            TabSiteProperties tabSiteProperties = null;
//            List<TabSiteProperties> list = new ArrayList<TabSiteProperties>();

//            TabSitePossibleProp tabSitePossibleProp = null;
//            List<TabSitePossibleProp> list = new ArrayList<TabSitePossibleProp>();

            Ueba2 ueba2 = null;
//            List<Ueba2> list = new ArrayList<Ueba2>();

            Shops shops = null;
//            List<Shops> list = new ArrayList<Shops>();

            ShopsRest shopsRest = null;
//            List<ShopsRest> list = new ArrayList<ShopsRest>();

            while (rs.next()){
                products = new Products();

                products.setId(rs.getInt("id"));
                products.setTitle(rs.getString("title"));
                products.setArticle(rs.getInt("article"));
                products.setBrend(rs.getInt("brend"));
                products.setGroup_id(rs.getInt("group_id"));

               list.add(products);
            }

            jObj.put("products", list);

            try{
                FileWriter file = new FileWriter(namedJSONFile+".json");
                file.write(jObj.toJSONString());
                file.flush();
                file.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }

            System.out.println(jObj.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONArray convertToJSON(ResultSet resultSet)
            throws Exception {
        JSONArray jsonArray = new JSONArray();
        while (resultSet.next()) {
            int total_rows = resultSet.getMetaData().getColumnCount();
            for (int i = 0; i < total_rows; i++) {
                JSONObject obj = new JSONObject();
                obj.put(resultSet.getMetaData().getColumnLabel(i + 1)
                        .toLowerCase(), resultSet.getObject(i + 1));
                jsonArray.add(obj);
            }
        }
        return jsonArray;
    }


    public static String convertToXML(ResultSet resultSet)
            throws Exception {
        StringBuffer xmlArray = new StringBuffer("<results>");
        while (resultSet.next()) {
            int total_rows = resultSet.getMetaData().getColumnCount();
            xmlArray.append("<result ");
            for (int i = 0; i < total_rows; i++) {
                xmlArray.append(" " + resultSet.getMetaData().getColumnLabel(i + 1)
                        .toLowerCase() + "='" + resultSet.getObject(i + 1) + "'"); }
            xmlArray.append(" />");
        }
        xmlArray.append("</results>");
        return xmlArray.toString();
    }
}
