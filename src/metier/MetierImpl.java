package metier;

import doa.IDao;

public class MetierImpl implements IMetier {
    private IDao d;
    @Override
    public double calcul() {
        double t=d.getdata()*23;
        double res=t*22/Math.cos(t*Math.PI);
        return res;
    }
    public void setD(IDao d) {
        this.d = d;
    }
}
