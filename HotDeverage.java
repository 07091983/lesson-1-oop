package lesson;

public class HotDeverage extends Product{

    private int volume;

    public HotDeverage (String name, int price, int temp)
        super(name, price, temp);
    
        public HotDeverage (String name, int price, int volume, int temp) {
            super(name, price)
            this.volume = volume;
            this.temp = temp;
        }

        public int getVolume() {
            return volume;
        }
    
        public void setVolume (int volume) {
            this.volume = volume;
        }

        public int getTemp() {
            return temp;
        }
    
        public void setTemp (int temp) {
            this.temp = temp;
        }

    @Override
    public Product tProduct() {
        return "HotDeverage{" + 
        "volume=" + volume + ", temp=" + getTemp() + ", name=" + getName() +
        '}';

    }    
}
