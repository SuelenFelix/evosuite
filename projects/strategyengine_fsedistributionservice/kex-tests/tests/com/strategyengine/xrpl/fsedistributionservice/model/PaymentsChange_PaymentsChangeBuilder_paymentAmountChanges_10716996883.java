package com.strategyengine.xrpl.fsedistributionservice.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class PaymentsChange_PaymentsChangeBuilder_paymentAmountChanges_10716996883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338124;
     Object term338164;

    public PaymentsChange_PaymentsChangeBuilder_paymentAmountChanges_10716996883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338125 = new Long(-5787975575293098129L);
        Object term338141 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338141, term338141.getClass(), "toClassicAddress", "");
        setField(term338141, term338141.getClass(), "amount", "");
        Object term338144 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338144, term338144.getClass(), "toClassicAddress", "");
        setField(term338144, term338144.getClass(), "amount", "");
        Object term338147 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338147, term338147.getClass(), "toClassicAddress", "");
        setField(term338147, term338147.getClass(), "amount", "");
        Object term338150 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338150, term338150.getClass(), "toClassicAddress", "");
        setField(term338150, term338150.getClass(), "amount", "");
        Object term338153 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338153, term338153.getClass(), "toClassicAddress", "");
        setField(term338153, term338153.getClass(), "amount", "");
        Object term338156 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338156, term338156.getClass(), "toClassicAddress", "");
        setField(term338156, term338156.getClass(), "amount", "");
        Object term338159 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338159, term338159.getClass(), "toClassicAddress", "");
        setField(term338159, term338159.getClass(), "amount", "");
        ArrayList term338139 = new ArrayList();
        ((ArrayList) term338139).add(term338141);
        ((ArrayList) term338139).add(term338144);
        ((ArrayList) term338139).add(term338147);
        ((ArrayList) term338139).add(term338150);
        ((ArrayList) term338139).add(term338153);
        ((ArrayList) term338139).add(term338156);
        ((ArrayList) term338139).add(term338159);
        term338124 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder"));
        setField(term338124, term338124.getClass(), "dropRequestId", term338125);
        setField(term338124, term338124.getClass(), "privateKey", "xKATihyOsy");
        setField(term338124, term338124.getClass(), "paymentAmountChanges", term338139);
        Object term338167 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338167, term338167.getClass(), "toClassicAddress", "MqkrVMSgoi");
        setField(term338167, term338167.getClass(), "amount", "mBvhIZezxE");
        Object term338193 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338193, term338193.getClass(), "toClassicAddress", "");
        setField(term338193, term338193.getClass(), "amount", "");
        Object term338197 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338197, term338197.getClass(), "toClassicAddress", null);
        setField(term338197, term338197.getClass(), "amount", null);
        term338164 = new LinkedList();
        ((LinkedList) term338164).add(term338167);
        ((LinkedList) term338164).add(term338193);
        ((LinkedList) term338164).add(term338197);
        ((LinkedList) term338164).add((Object)null);
        ((LinkedList) term338164).add((Object)null);
        ((LinkedList) term338164).add((Object)null);
        ((LinkedList) term338164).add((Object)null);
        ((LinkedList) term338164).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term338164;
        callMethod(klass, "paymentAmountChanges", argTypes, term338124, args);
    }

};


