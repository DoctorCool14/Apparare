package net.doctorcool.apparare.capabilities;

import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;

public class CapabilitySetup {
    public void registerCaps(RegisterCapabilitiesEvent event) {
        event.register(PlrRadiationCapability.class);
        event.register(PlrRadCapCapability.class);
    }

}
