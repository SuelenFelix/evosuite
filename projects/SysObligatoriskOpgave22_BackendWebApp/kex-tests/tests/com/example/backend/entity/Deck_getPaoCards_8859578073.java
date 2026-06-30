package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Deck_getPaoCards_8859578073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19981;

    public Deck_getPaoCards_8859578073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19982 = new Long(1592020674405941254L);
        Long term20011 = new Long(4098407345651793258L);
        Long term20014 = new Long(3128610259359668233L);
        Long term20017 = new Long(-4821516944173509228L);
        Object term20010 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20013 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20016 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20010, term20010.getClass(), "id", term20011);
        setField(term20013, term20013.getClass(), "id", term20014);
        setField(term20013, term20013.getClass(), "rank", null);
        setField(term20013, term20013.getClass(), "suit", null);
        setField(term20013, term20013.getClass(), "paoCards", null);
        setField(term20010, term20010.getClass(), "card", term20013);
        setField(term20016, term20016.getClass(), "id", term20017);
        setField(term20016, term20016.getClass(), "imageUrl", null);
        setField(term20016, term20016.getClass(), "person", null);
        setField(term20016, term20016.getClass(), "action", null);
        setField(term20016, term20016.getClass(), "object", null);
        setField(term20016, term20016.getClass(), "paoCard", null);
        setField(term20010, term20010.getClass(), "pao", term20016);
        Long term20020 = new Long(-4868523627266698649L);
        Object term20019 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20022 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20023 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20019, term20019.getClass(), "id", term20020);
        setField(term20022, term20022.getClass(), "id", null);
        setField(term20022, term20022.getClass(), "rank", null);
        setField(term20022, term20022.getClass(), "suit", null);
        setField(term20022, term20022.getClass(), "paoCards", null);
        setField(term20019, term20019.getClass(), "card", term20022);
        setField(term20023, term20023.getClass(), "id", null);
        setField(term20023, term20023.getClass(), "imageUrl", null);
        setField(term20023, term20023.getClass(), "person", null);
        setField(term20023, term20023.getClass(), "action", null);
        setField(term20023, term20023.getClass(), "object", null);
        setField(term20023, term20023.getClass(), "paoCard", null);
        setField(term20019, term20019.getClass(), "pao", term20023);
        Long term20025 = new Long(-8510452367371037137L);
        Object term20024 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20027 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20028 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20024, term20024.getClass(), "id", term20025);
        setField(term20027, term20027.getClass(), "id", null);
        setField(term20027, term20027.getClass(), "rank", null);
        setField(term20027, term20027.getClass(), "suit", null);
        setField(term20027, term20027.getClass(), "paoCards", null);
        setField(term20024, term20024.getClass(), "card", term20027);
        setField(term20028, term20028.getClass(), "id", null);
        setField(term20028, term20028.getClass(), "imageUrl", null);
        setField(term20028, term20028.getClass(), "person", null);
        setField(term20028, term20028.getClass(), "action", null);
        setField(term20028, term20028.getClass(), "object", null);
        setField(term20028, term20028.getClass(), "paoCard", null);
        setField(term20024, term20024.getClass(), "pao", term20028);
        Long term20030 = new Long(8845929725457841487L);
        Object term20029 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20032 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20033 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20029, term20029.getClass(), "id", term20030);
        setField(term20032, term20032.getClass(), "id", null);
        setField(term20032, term20032.getClass(), "rank", null);
        setField(term20032, term20032.getClass(), "suit", null);
        setField(term20032, term20032.getClass(), "paoCards", null);
        setField(term20029, term20029.getClass(), "card", term20032);
        setField(term20033, term20033.getClass(), "id", null);
        setField(term20033, term20033.getClass(), "imageUrl", null);
        setField(term20033, term20033.getClass(), "person", null);
        setField(term20033, term20033.getClass(), "action", null);
        setField(term20033, term20033.getClass(), "object", null);
        setField(term20033, term20033.getClass(), "paoCard", null);
        setField(term20029, term20029.getClass(), "pao", term20033);
        Long term20035 = new Long(2123432481270520381L);
        Object term20034 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20037 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20038 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20034, term20034.getClass(), "id", term20035);
        setField(term20037, term20037.getClass(), "id", null);
        setField(term20037, term20037.getClass(), "rank", null);
        setField(term20037, term20037.getClass(), "suit", null);
        setField(term20037, term20037.getClass(), "paoCards", null);
        setField(term20034, term20034.getClass(), "card", term20037);
        setField(term20038, term20038.getClass(), "id", null);
        setField(term20038, term20038.getClass(), "imageUrl", null);
        setField(term20038, term20038.getClass(), "person", null);
        setField(term20038, term20038.getClass(), "action", null);
        setField(term20038, term20038.getClass(), "object", null);
        setField(term20038, term20038.getClass(), "paoCard", null);
        setField(term20034, term20034.getClass(), "pao", term20038);
        Long term20040 = new Long(4911393165710268247L);
        Long term20043 = new Long(-836309941570511418L);
        Long term20046 = new Long(-4851193391918639512L);
        Object term20039 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term20042 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term20045 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term20039, term20039.getClass(), "id", term20040);
        setField(term20042, term20042.getClass(), "id", term20043);
        setField(term20042, term20042.getClass(), "rank", null);
        setField(term20042, term20042.getClass(), "suit", null);
        setField(term20042, term20042.getClass(), "paoCards", null);
        setField(term20039, term20039.getClass(), "card", term20042);
        setField(term20045, term20045.getClass(), "id", term20046);
        setField(term20045, term20045.getClass(), "imageUrl", null);
        setField(term20045, term20045.getClass(), "person", null);
        setField(term20045, term20045.getClass(), "action", null);
        setField(term20045, term20045.getClass(), "object", null);
        setField(term20045, term20045.getClass(), "paoCard", null);
        setField(term20039, term20039.getClass(), "pao", term20045);
        ArrayList term20008 = new ArrayList();
        ((ArrayList) term20008).add(term20010);
        ((ArrayList) term20008).add(term20019);
        ((ArrayList) term20008).add(term20024);
        ((ArrayList) term20008).add(term20029);
        ((ArrayList) term20008).add(term20019);
        ((ArrayList) term20008).add(term20034);
        ((ArrayList) term20008).add(term20039);
        ((ArrayList) term20008).add(term20024);
        ((ArrayList) term20008).add(term20019);
        term19981 = newInstance(Class.forName("com.example.backend.entity.Deck"));
        setField(term19981, term19981.getClass(), "id", term19982);
        setField(term19981, term19981.getClass(), "name", "YTxBqWRAlo");
        setField(term19981, term19981.getClass(), "description", "ReruUQRXwl");
        setField(term19981, term19981.getClass(), "paoCards", term20008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaoCards", argTypes, term19981, args);
    }

};


