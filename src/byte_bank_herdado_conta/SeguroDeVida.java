package byte_bank_herdado_conta;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}
	
}
