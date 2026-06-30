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

public class ProfileResp_setLevel_152066593228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97544;
     Object term97583;

    public ProfileResp_setLevel_152066593228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97544 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97544, term97544.getClass(), "userName", "tFQbHKqwNK");
        setIntField(term97544, term97544.getClass(), "level", 602203256);
        setLongField(term97544, term97544.getClass(), "exp", 2203717168327283506L);
        setLongField(term97544, term97544.getClass(), "point", 2045863109445898168L);
        setLongField(term97544, term97544.getClass(), "totalPoint", -7450546233309048710L);
        setIntField(term97544, term97544.getClass(), "playCount", -815462581);
        setIntField(term97544, term97544.getClass(), "jewelCount", 1872893004);
        setIntField(term97544, term97544.getClass(), "totalJewelCount", -2018767385);
        setIntField(term97544, term97544.getClass(), "playerRating", 326213434);
        setIntField(term97544, term97544.getClass(), "highestRating", -38210575);
        setIntField(term97544, term97544.getClass(), "battlePoint", 1758749237);
        setIntField(term97544, term97544.getClass(), "nameplateId", 2081677910);
        setIntField(term97544, term97544.getClass(), "trophyId", 291074104);
        setIntField(term97544, term97544.getClass(), "cardId", -656467413);
        setIntField(term97544, term97544.getClass(), "characterId", -946749221);
        setLongField(term97544, term97544.getClass(), "sumTechHighScore", -4517611496515463615L);
        setLongField(term97544, term97544.getClass(), "sumTechBasicHighScore", -473424060599761478L);
        setLongField(term97544, term97544.getClass(), "sumTechAdvancedHighScore", 1354479052873636977L);
        setLongField(term97544, term97544.getClass(), "sumTechExpertHighScore", -117512134107938746L);
        setLongField(term97544, term97544.getClass(), "sumTechMasterHighScore", -7140526075149130623L);
        setLongField(term97544, term97544.getClass(), "sumTechLunaticHighScore", -4426461911148980237L);
        setLongField(term97544, term97544.getClass(), "sumBattleHighScore", 2119372310151365060L);
        setLongField(term97544, term97544.getClass(), "sumBattleBasicHighScore", 3168529367313854171L);
        setLongField(term97544, term97544.getClass(), "sumBattleAdvancedHighScore", 6018592208859523081L);
        setLongField(term97544, term97544.getClass(), "sumBattleExpertHighScore", -2038659601689335459L);
        setLongField(term97544, term97544.getClass(), "sumBattleMasterHighScore", 1985814517618986307L);
        setLongField(term97544, term97544.getClass(), "sumBattleLunaticHighScore", -4870713741413113241L);
        term97583 = new Integer(-1428827689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97583;
        callMethod(klass, "setLevel", argTypes, term97544, args);
    }

};


