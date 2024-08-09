public class IPhone implements Smartphone, WebBrowser, MusicPlayer{
    private String model;
    private String serialNumber;

    public IPhone(String model, String serialNumber){
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void play() {
        System.out.println("Está tocando.");
    }

    @Override
    public void pause() {
        System.out.println("Não está tocando.");
    }

    @Override
    public void selectMusic(String musicName) {
        System.out.println("Música " + musicName + " selecionada com sucesso!");
    }

    @Override
    public void showWebPage(String url) {
        System.out.println("Indo para " + url);
    }

    @Override
    public void addNewPage() {
        System.out.println("Nova página adicionada!");
    }

    @Override
    public void updatePage() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void answer() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Correio de voz iniciado!");
    }
}
