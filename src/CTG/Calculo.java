package CTG;

/**
 *
 * @author gkrause
 */
public class Calculo /* Classe estática */
{
    private static float fixoAluguel    = 1000;
    private static float fixoSeguranca  = 700;
    private static float fixoTelefone   = 50;
    private static float fixoLimpeza    = 700;
    private static float fixoManutencao = 100;
    private static float fixoEnergia    = 200;
    private static float fixoSalarios   = 4000;
    private static float fixoAgua       = 50;
    
    private static float variavelProcessador = 1;
    private static float variavelPlacaMae    = 1;
    private static float variavelHd          = 1;
    private static float variavelFonte       = 1;
    private static float variavelPlacaVideo  = 1;
    private static float variavelGabinete    = 1;
    private static float variavelCooler      = 1;
    private static float variavelRam         = 2;
    
    private static float primaProcessador    = 746;
    private static float primaPlacaMae       = 400;
    private static float primaHd             = 380;
    private static float primaFonte          = 380;
    private static float primaPlacaVideo     = 2034;
    private static float primaGabinete       = 290;
    private static float primaCooler         = 200;
    private static float primaRam            = 369;
    
    private static float MargemContribuicao = 15;
    private static float vendaQuantidade    = 0;  
    
    public static float custoUnitario() /* CVu = variavel * prima */ 
    {
        float custoUnitario = (variavelProcessador * primaProcessador) 
                            + (variavelPlacaMae    * primaPlacaMae)
                            + (variavelHd          * primaHd)
                            + (variavelFonte       * primaFonte)
                            + (variavelPlacaVideo  * primaPlacaVideo)
                            + (variavelGabinete    * primaGabinete)
                            + (variavelCooler      * primaCooler)
                            + (variavelRam         * primaRam);
        return custoUnitario;
    }
    
    public static float precoVenda() 
    {
        float precoDeVenda;
        precoDeVenda = custoUnitario() / (1- (MargemContribuicao / 100));
        return precoDeVenda;
    }
    
    public static float receita() /* R = p x Q */
    {
        float receita;      
        receita = precoVenda() * vendaQuantidade;
        return receita;
    }
    
    public static float custoVariavel() /* CV = CVu * Q */
    {
        float custoVariavel = custoUnitario() * vendaQuantidade;
        
        return custoVariavel;
    }
    
    public static float custoFixo() /* CF = Soma de totos custos fixos */
    {
        float custoFixo = fixoAluguel    + fixoEnergia   + fixoLimpeza
                        + fixoManutencao + fixoSeguranca + fixoTelefone
                        + fixoSalarios   + fixoAgua;
        
        return custoFixo;
    }
    
    public static float quantidadeEquilibrio() /*Qe = CF / (pv - CVu)*/ 
    {
        float quantidadeEquilibrio;
        quantidadeEquilibrio = custoFixo() / (precoVenda() - custoUnitario());        
        return quantidadeEquilibrio;
    }
    
    public static float receitaEquilibrio()
    {
        float receitaEquilibrio;
        receitaEquilibrio = quantidadeEquilibrio() * precoVenda();
        return receitaEquilibrio;
    }
    
    public static float lucro() /* L = R - CV - CF */
    {
        float lucro = receita() - custoVariavel() - custoFixo();
        
        return lucro;
    }

    public static float getFixoSalarios()
    {
        return fixoSalarios;
    }

    public static void setFixoSalarios(float fixoSalarios)
    {
        Calculo.fixoSalarios = fixoSalarios;
    }

    public static float getFixoAgua()
    {
        return fixoAgua;
    }

    public static void setFixoAgua(float fixoAgua)
    {
        Calculo.fixoAgua = fixoAgua;
    }
    
    public static float getFixoAluguel()
    {
        return fixoAluguel;
    }

    public static void setFixoAluguel(float fixoAluguel)
    {
        Calculo.fixoAluguel = fixoAluguel;
    }

    public static float getFixoSeguranca()
    {
        return fixoSeguranca;
    }

    public static void setFixoSeguranca(float fixoSeguranca)
    {
        Calculo.fixoSeguranca = fixoSeguranca;
    }

    public static float getFixoTelefone()
    {
        return fixoTelefone;
    }

    public static void setFixoTelefone(float fixoTelefone)
    {
        Calculo.fixoTelefone = fixoTelefone;
    }

    public static float getFixoLimpeza()
    {
        return fixoLimpeza;
    }

    public static void setFixoLimpeza(float fixoLimpeza)
    {
        Calculo.fixoLimpeza = fixoLimpeza;
    }

    public static float getFixoManutencao()
    {
        return fixoManutencao;
    }

    public static void setFixoManutencao(float fixoManutencao)
    {
        Calculo.fixoManutencao = fixoManutencao;
    }

    public static float getFixoEnergia()
    {
        return fixoEnergia;
    }

    public static void setFixoEnergia(float fixoEnergia)
    {
        Calculo.fixoEnergia = fixoEnergia;
    }

    public static float getVariavelProcessador()
    {
        return variavelProcessador;
    }

    public static void setVariavelProcessador(float variavelProcessador)
    {
        Calculo.variavelProcessador = variavelProcessador;
    }

    public static float getVariavelPlacaMae()
    {
        return variavelPlacaMae;
    }

    public static void setVariavelPlacaMae(float variavelPlacaMae)
    {
        Calculo.variavelPlacaMae = variavelPlacaMae;
    }

    public static float getVariavelHd()
    {
        return variavelHd;
    }

    public static void setVariavelHd(float variavelHd)
    {
        Calculo.variavelHd = variavelHd;
    }

    public static float getVariavelFonte()
    {
        return variavelFonte;
    }

    public static void setVariavelFonte(float variavelFonte)
    {
        Calculo.variavelFonte = variavelFonte;
    }

    public static float getVariavelPlacaVideo()
    {
        return variavelPlacaVideo;
    }

    public static void setVariavelPlacaVideo(float variavelPlacaVideo)
    {
        Calculo.variavelPlacaVideo = variavelPlacaVideo;
    }

    public static float getVariavelGabinete()
    {
        return variavelGabinete;
    }

    public static void setVariavelGabinete(float variavelGabinete)
    {
        Calculo.variavelGabinete = variavelGabinete;
    }

    public static float getVariavelCooler()
    {
        return variavelCooler;
    }

    public static void setVariavelCooler(float variavelCooler)
    {
        Calculo.variavelCooler = variavelCooler;
    }

    public static float getVariavelRam()
    {
        return variavelRam;
    }

    public static void setVariavelRam(float variavelRam)
    {
        Calculo.variavelRam = variavelRam;
    }

    public static float getPrimaProcessador()
    {
        return primaProcessador;
    }

    public static void setPrimaProcessador(float primaProcessador)
    {
        Calculo.primaProcessador = primaProcessador;
    }

    public static float getPrimaPlacaMae()
    {
        return primaPlacaMae;
    }

    public static void setPrimaPlacaMae(float primaPlacaMae)
    {
        Calculo.primaPlacaMae = primaPlacaMae;
    }

    public static float getPrimaHd()
    {
        return primaHd;
    }

    public static void setPrimaHd(float primaHd)
    {
        Calculo.primaHd = primaHd;
    }

    public static float getPrimaFonte()
    {
        return primaFonte;
    }

    public static void setPrimaFonte(float primaFonte)
    {
        Calculo.primaFonte = primaFonte;
    }

    public static float getPrimaPlacaVideo()
    {
        return primaPlacaVideo;
    }

    public static void setPrimaPlacaVideo(float primaPlacaVideo)
    {
        Calculo.primaPlacaVideo = primaPlacaVideo;
    }

    public static float getPrimaGabinete()
    {
        return primaGabinete;
    }

    public static void setPrimaGabinete(float primaGabinete)
    {
        Calculo.primaGabinete = primaGabinete;
    }

    public static float getPrimaCooler()
    {
        return primaCooler;
    }

    public static void setPrimaCooler(float primaCooler)
    {
        Calculo.primaCooler = primaCooler;
    }

    public static float getPrimaRam()
    {
        return primaRam;
    }

    public static void setPrimaRam(float primaRam)
    {
        Calculo.primaRam = primaRam;
    }

    public static float getMargemContribuicao()
    {
        return MargemContribuicao;
    }

    public static void setMargemContribuicao(float MargemContribuicao)
    {
        Calculo.MargemContribuicao = MargemContribuicao;
    }

    public static float getVendaQuantidade()
    {
        return vendaQuantidade;
    }

    public static void setVendaQuantidade(float vendaQuantidade)
    {
        Calculo.vendaQuantidade = vendaQuantidade;
    }   
    
}
