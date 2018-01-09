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

public class Main {

    public static void main(String[] args) {
        createJSONFile("table");
    }

    public static void createJSONFile(String namedJSONFile){
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.10.56:1521:ora112", "gastello", "gjkysqgbpltw");
            System.out.println("Connection Established"+ con);
            String qry = "SELECT s.NN id,\n" +
                    "       s.NAME title,\n" +
                    "       s.NN article,\n" +
                    "       s.NN group_id, \n" +
                    "       s.DESCR description \n" +
                    "  FROM GASTELLO.CAT_SKLALL s\n" +
                    "  WHERE s.AT_SITE = 1\n" +
                    "    AND s.TYPE_ID IS NOT NULL";
            st = con.createStatement();
            rs = st.executeQuery(qry);

            JSONObject jObj = new JSONObject();

            ArrayList<Table> list = new ArrayList<Table>();
            Table sPojo = null;
            while (rs.next()) {
                sPojo=new Table();

                sPojo.setId(rs.getString("id"));
                sPojo.setTitle(rs.getString("title"));
                sPojo.setArticle(rs.getString("article"));
                sPojo.setGroupId(rs.getString("group_id"));
                sPojo.setDescription(rs.getString("description"));
                list.add(sPojo);

            }

            jObj.put("tabledetails",list);
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
