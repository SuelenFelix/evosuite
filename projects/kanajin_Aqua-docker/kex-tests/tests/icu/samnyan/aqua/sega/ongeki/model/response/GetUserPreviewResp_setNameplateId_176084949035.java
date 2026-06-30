package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GetUserPreviewResp_setNameplateId_176084949035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7770;
     Object term7820;

    public GetUserPreviewResp_setNameplateId_176084949035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7770 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp"));
        setLongField(term7770, term7770.getClass(), "userId", -8859332911664940963L);
        setBooleanField(term7770, term7770.getClass(), "isLogin", true);
        setField(term7770, term7770.getClass(), "lastLoginDate", "JKGueoHesL");
        setField(term7770, term7770.getClass(), "userName", "");
        setIntField(term7770, term7770.getClass(), "reincarnationNum", 2094923086);
        setIntField(term7770, term7770.getClass(), "level", 1532355365);
        setLongField(term7770, term7770.getClass(), "exp", 7048544371106200955L);
        setLongField(term7770, term7770.getClass(), "playerRating", -6299955839293054069L);
        setField(term7770, term7770.getClass(), "lastGameId", "");
        setField(term7770, term7770.getClass(), "lastRomVersion", "");
        setField(term7770, term7770.getClass(), "lastDataVersion", "");
        setField(term7770, term7770.getClass(), "lastPlayDate", "CRAUqtVBkU");
        setIntField(term7770, term7770.getClass(), "nameplateId", -156316508);
        setIntField(term7770, term7770.getClass(), "trophyId", -1304449497);
        setIntField(term7770, term7770.getClass(), "cardId", -80320412);
        setIntField(term7770, term7770.getClass(), "dispPlayerLv", -356797136);
        setIntField(term7770, term7770.getClass(), "dispRating", -2035641970);
        setIntField(term7770, term7770.getClass(), "dispBP", 1813581230);
        setIntField(term7770, term7770.getClass(), "headphone", 844569461);
        setIntField(term7770, term7770.getClass(), "banStatus", -15085966);
        setBooleanField(term7770, term7770.getClass(), "isWarningConfirmed", true);
        setIntField(term7770, term7770.getClass(), "lastEmoneyBrand", -1929631412);
        setIntField(term7770, term7770.getClass(), "lastEmoneyCredit", 1014160441);
        term7820 = new Integer(975753484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7820;
        callMethod(klass, "setNameplateId", argTypes, term7770, args);
    }

};


