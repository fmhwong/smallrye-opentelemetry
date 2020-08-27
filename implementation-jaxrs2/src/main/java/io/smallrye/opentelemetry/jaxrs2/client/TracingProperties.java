package io.smallrye.opentelemetry.jaxrs2.client;

/**
 * @author Pavol Loffay, Felix Wong
 */
public class TracingProperties {

    private TracingProperties() {
    }

    /**
     * Denotes a parent span context {@link io.opentracing.References#CHILD_OF}.
     * If it is not specified a new trace will be started.
     * Set on {@link javax.ws.rs.client.Invocation#property(String, Object)}.
     */
    public static final String CHILD_OF = ClientTracingFilter.class.getName() + ".child_of";

    /**
     * Indicates whether request should be traced or not. If it is not
     * present and client is correctly configured request will be traced.
     * Value should be a boolean (trace disabled/enabled).
     * Set on {@link javax.ws.rs.client.Invocation#property(String, Object)}.
     */
    public static final String TRACING_DISABLED = ClientTracingFilter.class.getName() + ".tracingDisabled";
}
