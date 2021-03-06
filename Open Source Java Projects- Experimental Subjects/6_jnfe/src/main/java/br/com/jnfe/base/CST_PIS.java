/* Copyright 2005 I Serv Consultoria Empresarial Ltda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.jnfe.base;

/**
 * C�digo da situa��o tribut�ria do PIS.
 * 
 * @author Mauricio Fernandes de Castro
 */
public enum CST_PIS {
	
	/**
	 * Base de c�lculo = valor da opera��o al�quota normal 
	 * (cumulativo/n�ocumulativo).
	 */
	PIS_01("01", "Aliq", "Al�quota normal", false, "vBC", "pPIS", "vPIS"),
	/**
	 * Base de c�lculo = valor da opera��o 
	 * (al�quota diferenciada).
	 */
	PIS_02("02", "Aliq", "Al�quota diferenciada", false, "vBC", "pPIS", "vPIS"),
	/**
	 * Base de c�lculo = quantidade vendida x al�quota por 
	 * unidade de produto.
	 */
	PIS_03("03", "Qtde", "Al�quota por unidade de produto", false, "qBCProd", "vAliqProd", "vPIS"),
	/**
	 * Tributa��o monof�sica (al�quota zero).
	 */
	PIS_04("04", "NT",   "Tributa��o monof�sica", true),
	/**
	 * Al�quota zero.
	 */
	PIS_06("06", "NT",   "Al�quota zero", true),
	/** 
	 * Opera��o Isenta da contribui��o;
	 */
	PIS_07("07", "NT",   "Isento da contribui��o", true),
	/**
	 * Opera��o sem Incid�ncia da contribui��o.
	 */
	PIS_08("08", "NT",   "Sem Incid�ncia da contribui��o", true),
	/**
	 * Opera��o com suspens�o da contribui��o.
	 */
	PIS_09("09", "NT",   "Com suspens�o da contribui��o", true),
	/**
	 * Outras opera��es.
	 */
	PIS_99("99", "Outr", "Outras opera��es", false, "vBC", "pPIS", "qBCProd", "vAliqProd", "vPIS");
	
	private CST_PIS(String value, String group, String desc, boolean isento, String... requiredTags) {
		this.value = value;
		this.group = group;
		this.desc = desc;
		this.isento = isento;
		this.requiredTags = requiredTags;
	}
	
	private String value;
	private String group;
	private String desc;
	private boolean isento;
	private String[] requiredTags;
	
	/**
	 * C�digo atribu�do ao CST PIS.
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Grupo de CST PIS.
	 */
	public String getGroup() {
		return group;
	}
	
	/**
	 * Descri��o.
	 */
	public String getDesc() {
		return desc;
	}
	
	/**
	 * Verdadeiro se isento.
	 */
	public boolean isIsento() {
		return isento;
	}

	/**
	 * Verdadeiro se a tag � requerida neste CST.
	 * 
	 * @param tag
	 */
	public boolean isRequiredTag(String tag) {
		for (String requiredTag: requiredTags) {
			if (tag.equals(requiredTag)) {
				return true;
			}
		}
		return false;
	}

}
