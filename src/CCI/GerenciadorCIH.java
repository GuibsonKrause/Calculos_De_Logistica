package CCI;

import CIH.CustoFixo;
import CIH.CustoVariavel;
import CIH.MateriaPrima;
import CIH.Venda;
import CTG.Calculo;

/**
 *
 * @author gkrause
 */
public class GerenciadorCIH
{
    private CustoFixo objCustoFixo;
    private CustoVariavel objCustoVariavel;
    private MateriaPrima objMateriaPrima;
    private Venda objVenda;

    public GerenciadorCIH()
    {
        objCustoFixo = null;
        objCustoVariavel = null;
        objMateriaPrima = null;
        objVenda = null;
    }
    
    public void janelaVenda()
    {
        if (objVenda == null)
        {
            objVenda = new Venda(this);
        }
        objVenda.setVisible(true);
    }
    
    public void janelaCustoFixo()
    {
        if (objCustoFixo == null)
        {
            objCustoFixo = new CustoFixo(null, true, this);
        }
        objCustoFixo.setVisible(true);
    }
    
    public void janelaCustoVariavel()
    {
        if (objCustoVariavel == null)
        {
            objCustoVariavel = new CustoVariavel(null, true, this);
        }
        objCustoVariavel.setVisible(true);
    }
    
    public void janelaMateriaPrima()
    {
        if (objMateriaPrima == null)
        {
            objMateriaPrima = new MateriaPrima(null, true, this);
        }
        objMateriaPrima.setVisible(true);
    }
    
    public static void main(String[] args)
    {

        GerenciadorCIH gerCCI = new GerenciadorCIH();
        gerCCI.janelaVenda();

    }
    
}
