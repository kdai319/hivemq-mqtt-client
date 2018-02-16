package org.mqttbee.api.mqtt5.message.auth;

import org.mqttbee.annotations.DoNotImplement;
import org.mqttbee.annotations.NotNull;
import org.mqttbee.annotations.Nullable;

import java.nio.ByteBuffer;

/**
 * @author Silvio Giebl
 */
@DoNotImplement
public interface Mqtt5ExtendedAuthBuilder {

    @NotNull
    Mqtt5ExtendedAuthBuilder withData(@Nullable byte[] data);

    @NotNull
    Mqtt5ExtendedAuthBuilder withData(@Nullable ByteBuffer data);

}