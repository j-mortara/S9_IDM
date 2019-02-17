/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.idm.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.idm.xtext.ide.contentassist.antlr.internal.InternalSmartHomeDSLParser;
import fr.unice.polytech.idm.xtext.services.SmartHomeDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SmartHomeDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SmartHomeDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SmartHomeDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getDurationUnitAccess().getAlternatives(), "rule__DurationUnit__Alternatives");
			builder.put(grammarAccess.getSmartHomeAccess().getGroup(), "rule__SmartHome__Group__0");
			builder.put(grammarAccess.getSmartHomeAccess().getGroup_5(), "rule__SmartHome__Group_5__0");
			builder.put(grammarAccess.getSmartHomeAccess().getGroup_8(), "rule__SmartHome__Group_8__0");
			builder.put(grammarAccess.getSmartHomeAccess().getGroup_12(), "rule__SmartHome__Group_12__0");
			builder.put(grammarAccess.getLocationAccess().getGroup(), "rule__Location__Group__0");
			builder.put(grammarAccess.getLocationAccess().getGroup_4(), "rule__Location__Group_4__0");
			builder.put(grammarAccess.getLocationAccess().getGroup_4_1(), "rule__Location__Group_4_1__0");
			builder.put(grammarAccess.getSensorTypeAccess().getGroup(), "rule__SensorType__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup_2(), "rule__Rule__Group_2__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getSmartHomeAccess().getSensorTypesAssignment_4(), "rule__SmartHome__SensorTypesAssignment_4");
			builder.put(grammarAccess.getSmartHomeAccess().getSensorTypesAssignment_5_1(), "rule__SmartHome__SensorTypesAssignment_5_1");
			builder.put(grammarAccess.getSmartHomeAccess().getLocationsAssignment_7(), "rule__SmartHome__LocationsAssignment_7");
			builder.put(grammarAccess.getSmartHomeAccess().getLocationsAssignment_8_1(), "rule__SmartHome__LocationsAssignment_8_1");
			builder.put(grammarAccess.getSmartHomeAccess().getRulesAssignment_11(), "rule__SmartHome__RulesAssignment_11");
			builder.put(grammarAccess.getSmartHomeAccess().getRulesAssignment_12_1(), "rule__SmartHome__RulesAssignment_12_1");
			builder.put(grammarAccess.getLocationAccess().getNameAssignment_2(), "rule__Location__NameAssignment_2");
			builder.put(grammarAccess.getLocationAccess().getSensorsAssignment_4_0(), "rule__Location__SensorsAssignment_4_0");
			builder.put(grammarAccess.getLocationAccess().getSensorsAssignment_4_1_1(), "rule__Location__SensorsAssignment_4_1_1");
			builder.put(grammarAccess.getSensorTypeAccess().getNameAssignment_1(), "rule__SensorType__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getNameAssignment_1(), "rule__Sensor__NameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getSensorTypeAssignment_2(), "rule__Sensor__SensorTypeAssignment_2");
			builder.put(grammarAccess.getSensorAccess().getDataFileAssignment_4(), "rule__Sensor__DataFileAssignment_4");
			builder.put(grammarAccess.getRuleAccess().getConditionsAssignment_1(), "rule__Rule__ConditionsAssignment_1");
			builder.put(grammarAccess.getRuleAccess().getConditionsAssignment_2_1(), "rule__Rule__ConditionsAssignment_2_1");
			builder.put(grammarAccess.getRuleAccess().getDurationAssignment_4(), "rule__Rule__DurationAssignment_4");
			builder.put(grammarAccess.getRuleAccess().getEventAssignment_6(), "rule__Rule__EventAssignment_6");
			builder.put(grammarAccess.getConditionAccess().getSensorAssignment_0(), "rule__Condition__SensorAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_1(), "rule__Condition__OperatorAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getOperandAssignment_2(), "rule__Condition__OperandAssignment_2");
			builder.put(grammarAccess.getDurationAccess().getValueAssignment_0(), "rule__Duration__ValueAssignment_0");
			builder.put(grammarAccess.getDurationAccess().getUnitAssignment_1(), "rule__Duration__UnitAssignment_1");
			builder.put(grammarAccess.getEventAccess().getDescriptionAssignment(), "rule__Event__DescriptionAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SmartHomeDSLGrammarAccess grammarAccess;

	@Override
	protected InternalSmartHomeDSLParser createParser() {
		InternalSmartHomeDSLParser result = new InternalSmartHomeDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmartHomeDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmartHomeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
