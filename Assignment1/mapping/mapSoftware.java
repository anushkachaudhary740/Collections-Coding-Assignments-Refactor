package corejava.collection.assignment02.Assignment1.mapping;

import corejava.collection.assignment02.Assignment1.model.Software;

public class mapSoftware {
    public static Software map(String data) {

        String[] splitArray = data.split(",");
        try {
           ;
            String version = splitArray[3];
            String server = splitArray[0];
            String dataBase = splitArray[1];
            String operatingSystem = splitArray[2];
            Software software = new Software(server, dataBase,operatingSystem, version);

            return software;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
