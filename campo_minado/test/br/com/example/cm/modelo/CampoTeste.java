package br.com.example.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
			
		private Campo campo;
		
		@BeforeEach
		void iniciarCampo() {
			campo = new Campo(3,3);
		}
		
		@Test
		void testeVizinhoRealDistancia1() {
			Campo vizinho = new Campo(3,2);
			
			boolean resultado = campo.adicionarVizinho(vizinho);
			assertTrue(resultado);
			
		}
		
		@Test
		void testeVizinhoRealDistancia2() {
			Campo vizinho = new Campo(2,2);
			
			boolean resultado = campo.adicionarVizinho(vizinho);
			assertTrue(resultado);
			
		}
		@Test
		void testeNaoVizinho() {
			Campo vizinho = new Campo(1,1);
			
			boolean resultado = campo.adicionarVizinho(vizinho);
			assertFalse(resultado);
			
		}

}
