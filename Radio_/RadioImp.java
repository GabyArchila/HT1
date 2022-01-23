
public class RadioImp implements Radio{
  //Atributos
  private boolean frequency; 
  private int positionAM; 
  private int positionFM; 
  private double station;
  private boolean onOff;

  //Arraylist's
  private double [] favAM;
  private double [] favFM;

  //Constructor
  RadioImp(){
    this.frequency = true;
  }

  //Métodos
  /******GETTERS******/
  public boolean getFrequency(){
    return this.frequency;
  }

  public int getPositioAM(){
    return this.positionAM;
  }

  public int getPositioFM(){
    return this.positionFM;
  }

  public double getStation(){
    return this.station;
  }

  public double[] getFavAM() {
    return this.favAM;
  }

  public double[] getFavFM() {
    return this.favFM;
  }

  public boolean isOnOff() {
    return this.onOff;
  }

  /******SETTERS******/
  public void setFrequency(boolean _frequency){
    this.frequency = _frequency;
  }

  public void setPositionAM(int _positionAM){
    this.positionAM = _positionAM;
  }

  public void setPositionFM(int _positionFM){
    this.positionFM = _positionFM;
  }

  public void setStation(double _station){
    this.station = _station;
  }

  public void setFavAM(double[] favAM) {
    this.favAM = favAM;
  }

  public void setFavFM(double[] favFM) {
    this.favFM = favFM;
  }

  public void setOnOff(boolean onOff) {
    this.onOff = onOff;
  } 

  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();
  }

  @Override
  public boolean isOn() {
    return true;
  }

  @Override
  public void turnOnOff() {
    onOff = false;
  }

  @Override
  public void nextStation(boolean frequency) {
    frequency = true;
  }

  @Override
  public void prevStation(boolean frequency) { 
    frequency = false;
  }

  @Override
  public void saveStation(int positionAM, double station) { 
    this.positionAM = positionAM;
    this.station = station;
  }

  @Override
  public double getSavedStation(int position) {
    return 0;
  }

  @Override
  public void switchAMFM() { 
  }
  
}