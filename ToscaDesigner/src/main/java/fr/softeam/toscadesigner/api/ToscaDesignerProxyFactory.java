/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api;

import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'ToscaDesigner' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>null</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< CapabilitiesType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CapabilitiesType}
 * <li><< CapabilityDefinitionsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CapabilityDefinitionsType}
 * <li><< ConstraintsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ConstraintsType}
 * <li><< InstanceStateType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link InstanceStateType}
 * <li><< InterfacesType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link InterfacesType}
 * <li><< MaxInstancesType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link MaxInstancesType}
 * <li><< PoliciesType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PoliciesType}
 * <li><< RelationshipConstraintType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RelationshipConstraintType}
 * <li><< RelationshipConstraintsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RelationshipConstraintsType}
 * <li><< RelationshipOperationType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RelationshipOperationType}
 * <li><< RequirementDefinitionsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementDefinitionsType}
 * <li><< RequirementsType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementsType}
 * <li><< SourceElementType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link SourceElementType}
 * <li><< TCapability >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TCapability}
 * <li><< TCapabilityDefinition >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TCapabilityDefinition}
 * <li><< TDeploymentArtifact >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDeploymentArtifact}
 * <li><< TDeploymentArtifacts >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDeploymentArtifacts}
 * <li><< TDocumentation >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TDocumentation}
 * <li><< TEntityTemplate >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TEntityTemplate}
 * <li><< TExtensibleElements >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link TExtensibleElements}
 * <li><< TNodeTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TNodeTemplate}
 * <li><< TNodeType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TNodeType}
 * <li><< TPlans >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPlans}
 * <li><< TPolicy >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPolicy}
 * <li><< TRelationshipTemplate >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link TRelationshipTemplate}
 * <li><< TRelationshipType >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRelationshipType}
 * <li><< TRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRequirement}
 * <li><< TRequirementDefinition >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TRequirementDefinition}
 * <li><< TServiceTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TServiceTemplate}
 * <li><< TTopologyElementInstanceStates >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TTopologyElementInstanceStates}
 * <li><< TTopologyTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TTopologyTemplate}
 * <li><< TargetElementType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link TargetElementType}
 * <li><< ToscaModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ToscaModel}
 * <li><< TPlan >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link TPlan}
 * <li><< CloudServiceArchiveDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link CloudServiceArchiveDiagram}
 * <li><< ServiceTemplateDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link ServiceTemplateDiagram}
 * <li><< TopologyTemplateDiagram >> on a {@link org.modelio.metamodel.diagrams.StaticDiagram}: instantiates a {@link TopologyTemplateDiagram}
 * </ul>
 */
@objid ("365cd17d-2d04-4020-839d-7e7bdefdf43f")
public class ToscaDesignerProxyFactory {
    @objid ("260e90b3-f49d-4408-8b2e-6669e99caf61")
    private static final String ASSETNAME = "ToscaDesigner";

    @objid ("fcd99806-1078-4d04-abea-5c4311d890c9")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * @param session The modeling session this factory is operating in.
     */
    @objid ("ce525fcb-9c53-417b-8dbf-f43bc62ee2ef")
    public static final void initialize(final IModelingSession session) throws MdaProxyException {
        fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.InterfacesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.MaxInstancesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.PoliciesType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipOperationType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifact.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.tosca.standard.class_.TPlan.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.MdaTypes.init(session);
        fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.MdaTypes.init(session);
        
    }

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'ToscaDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("2a7d65cc-d0dc-4b48-8344-1558eda48e02")
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              ModuleComponent module = s.getModule();
              if (module != null && module.getName().equals(ASSETNAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'ToscaDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("0e0d409b-7e22-4f8c-b4ce-9f129d9c6d8c")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("d783403b-cb7b-4ec9-a2b9-c7a6b3a98432")
    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("2647788d-e7a5-4fca-9a62-18dd28236d31")
        private String stName;

        @objid ("4a787eff-88db-4d1d-9889-2f80a43841a4")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("b2ef7985-3de2-4db7-9143-4c8d2b9e1480")
        @Override
        public final Object visitAssociation(Association obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitAssociation(obj);
            
        }

        @objid ("efbc9f0c-0441-45ce-8140-964f60828654")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.package_.ToscaModel.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
            
        }

        @objid ("140b8808-acfd-41a2-88a1-855cd83d94cc")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.MaxInstancesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.MaxInstancesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.SourceElementType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.datatype.TargetElementType.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitDataType(obj);
            
        }

        @objid ("d4ac1454-adf9-4239-8fb1-06048f10eaf0")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilitiesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.ConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.InstanceStateType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.InterfacesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.InterfacesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.PoliciesType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.PoliciesType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipOperationType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipOperationType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementDefinitionsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.RequirementsType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifact.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifact.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDeploymentArtifacts.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TServiceTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyElementInstanceStates.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.standard.class_.TPlan.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.standard.class_.TPlan.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClass(obj);
            
        }

        @objid ("eac8e005-aafc-4e96-a7e3-a74729543997")
        @Override
        public final Object visitStaticDiagram(StaticDiagram obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.CloudServiceArchiveDiagram.instantiate(obj);
            	case fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.ServiceTemplateDiagram.instantiate(obj);
            	case fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.automatic.standard.staticdiagram.TopologyTemplateDiagram.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitStaticDiagram(obj);
            
        }

        @objid ("1526f54c-fdc2-4a7e-abad-14824af2b838")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate.instantiate(obj);
            	case fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements.STEREOTYPE_NAME: return fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
            
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("0c0b8814-f3f7-4f9c-b5f6-06b20d241997")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
