package pl.edu.agh.kis.pz1;
//przyjmowanie plikow csv i xlsx, sprawdzanie ich poprawnosci, parsowanie do xml


public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new Exception("zla liczb arg");
        } else if (args[0].split("\\.")[1].equals("csv")) {
            //

        } else if (args[0].split("\\.")[1].equals("xlsx")) {
            //
        } else {
            throw new Exception("zly format pliku");
        }
    }
}
