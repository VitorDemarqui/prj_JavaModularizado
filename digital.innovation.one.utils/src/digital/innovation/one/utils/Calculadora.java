package digital.innovation.one.utils;


import digital.innovation.one.utils.internal.DivHelper;
import digital.innovation.one.utils.internal.MultiHelper;
import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.SumHelper;

public class Calculadora {
    private final DivHelper divHelper;
    private final MultiHelper multiHelper;
    private final SubHelper subHelper;
    private final SumHelper sumHelper;

public Calculadora(){
    divHelper = new DivHelper();
    multiHelper = new MultiHelper();
    subHelper = new SubHelper();
    sumHelper = new SumHelper();
}

    public int sum(int a, int b){
    //chama a sumHelper metodo execute
    return sumHelper.execute(a, b);
}

    public int sub(int a, int b){
    //chama a sumHelper metodo execute
    return subHelper.execute(a, b);
}

    public int multi(int a, int b){
    //chama a sumHelper metodo execute
    return multiHelper.execute(a, b);
}

    public int div(int a, int b){
    //chama a sumHelper metodo execute
    return divHelper.execute(a, b);
}

}
