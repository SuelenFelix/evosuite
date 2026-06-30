package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class GameCharge_setId_151876124610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139;
     Object term1197;

    public GameCharge_setId_151876124610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1139 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1154 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1155 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1159 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1180 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1139, term1139.getClass(), "id", -2813493605142626659L);
        setIntField(term1139, term1139.getClass(), "orderId", 1540719661);
        setIntField(term1139, term1139.getClass(), "chargeId", 1265463001);
        setIntField(term1139, term1139.getClass(), "price", 335112684);
        setIntField(term1145, term1145.getClass(), "year", 2022);
        setShortField(term1145, term1145.getClass(), "month", (short) 11);
        setShortField(term1145, term1145.getClass(), "day", (short) 10);
        setField(term1144, term1144.getClass(), "date", term1145);
        setByteField(term1149, term1149.getClass(), "hour", (byte) 20);
        setByteField(term1149, term1149.getClass(), "minute", (byte) 8);
        setByteField(term1149, term1149.getClass(), "second", (byte) 35);
        setIntField(term1149, term1149.getClass(), "nano", 658416570);
        setField(term1144, term1144.getClass(), "time", term1149);
        setField(term1139, term1139.getClass(), "startDate", term1144);
        setIntField(term1155, term1155.getClass(), "year", 2018);
        setShortField(term1155, term1155.getClass(), "month", (short) 11);
        setShortField(term1155, term1155.getClass(), "day", (short) 9);
        setField(term1154, term1154.getClass(), "date", term1155);
        setByteField(term1159, term1159.getClass(), "hour", (byte) 6);
        setByteField(term1159, term1159.getClass(), "minute", (byte) 8);
        setByteField(term1159, term1159.getClass(), "second", (byte) 32);
        setIntField(term1159, term1159.getClass(), "nano", 750733310);
        setField(term1154, term1154.getClass(), "time", term1159);
        setField(term1139, term1139.getClass(), "endDate", term1154);
        setIntField(term1139, term1139.getClass(), "salePrice", 1551099402);
        setIntField(term1166, term1166.getClass(), "year", 2010);
        setShortField(term1166, term1166.getClass(), "month", (short) 2);
        setShortField(term1166, term1166.getClass(), "day", (short) 24);
        setField(term1165, term1165.getClass(), "date", term1166);
        setByteField(term1170, term1170.getClass(), "hour", (byte) 17);
        setByteField(term1170, term1170.getClass(), "minute", (byte) 58);
        setByteField(term1170, term1170.getClass(), "second", (byte) 56);
        setIntField(term1170, term1170.getClass(), "nano", 291725532);
        setField(term1165, term1165.getClass(), "time", term1170);
        setField(term1139, term1139.getClass(), "saleStartDate", term1165);
        setIntField(term1176, term1176.getClass(), "year", 2028);
        setShortField(term1176, term1176.getClass(), "month", (short) 7);
        setShortField(term1176, term1176.getClass(), "day", (short) 22);
        setField(term1175, term1175.getClass(), "date", term1176);
        setByteField(term1180, term1180.getClass(), "hour", (byte) 18);
        setByteField(term1180, term1180.getClass(), "minute", (byte) 33);
        setByteField(term1180, term1180.getClass(), "second", (byte) 7);
        setIntField(term1180, term1180.getClass(), "nano", 763613074);
        setField(term1175, term1175.getClass(), "time", term1180);
        setField(term1139, term1139.getClass(), "saleEndDate", term1175);
        setField(term1139, term1139.getClass(), "remarks", "NRdvgJlhkX");
        term1197 = new Long(-8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1197;
        callMethod(klass, "setId", argTypes, term1139, args);
    }

};


