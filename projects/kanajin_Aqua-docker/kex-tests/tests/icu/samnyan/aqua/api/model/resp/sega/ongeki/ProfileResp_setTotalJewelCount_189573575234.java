package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProfileResp_setTotalJewelCount_189573575234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97850;
     Object term97889;

    public ProfileResp_setTotalJewelCount_189573575234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97850 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97850, term97850.getClass(), "userName", "JkifeWxvfj");
        setIntField(term97850, term97850.getClass(), "level", -472412181);
        setLongField(term97850, term97850.getClass(), "exp", 2747672033504827510L);
        setLongField(term97850, term97850.getClass(), "point", 1642239165122276885L);
        setLongField(term97850, term97850.getClass(), "totalPoint", 4955738185628628826L);
        setIntField(term97850, term97850.getClass(), "playCount", -2078357662);
        setIntField(term97850, term97850.getClass(), "jewelCount", -564422217);
        setIntField(term97850, term97850.getClass(), "totalJewelCount", -577288385);
        setIntField(term97850, term97850.getClass(), "playerRating", -1601055853);
        setIntField(term97850, term97850.getClass(), "highestRating", 213487783);
        setIntField(term97850, term97850.getClass(), "battlePoint", -248814862);
        setIntField(term97850, term97850.getClass(), "nameplateId", -1292165014);
        setIntField(term97850, term97850.getClass(), "trophyId", 1752845769);
        setIntField(term97850, term97850.getClass(), "cardId", -1990745522);
        setIntField(term97850, term97850.getClass(), "characterId", -1489154741);
        setLongField(term97850, term97850.getClass(), "sumTechHighScore", -8297788425518233457L);
        setLongField(term97850, term97850.getClass(), "sumTechBasicHighScore", -5792034495091927806L);
        setLongField(term97850, term97850.getClass(), "sumTechAdvancedHighScore", -6102054856844419101L);
        setLongField(term97850, term97850.getClass(), "sumTechExpertHighScore", 1261121221020028585L);
        setLongField(term97850, term97850.getClass(), "sumTechMasterHighScore", -3794962090779425961L);
        setLongField(term97850, term97850.getClass(), "sumTechLunaticHighScore", -6273896411740041379L);
        setLongField(term97850, term97850.getClass(), "sumBattleHighScore", 2608197156995785706L);
        setLongField(term97850, term97850.getClass(), "sumBattleBasicHighScore", 4407143508564865762L);
        setLongField(term97850, term97850.getClass(), "sumBattleAdvancedHighScore", 9150378657822739421L);
        setLongField(term97850, term97850.getClass(), "sumBattleExpertHighScore", 2864485934162096854L);
        setLongField(term97850, term97850.getClass(), "sumBattleMasterHighScore", -6544538385658426764L);
        setLongField(term97850, term97850.getClass(), "sumBattleLunaticHighScore", -2630031637664316907L);
        term97889 = new Integer(-22066815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97889;
        callMethod(klass, "setTotalJewelCount", argTypes, term97850, args);
    }

};


