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
import java.lang.Long;

public class ProfileResp_setSumBattleHighScore_127075740148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98564;
     Object term98603;

    public ProfileResp_setSumBattleHighScore_127075740148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98564 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98564, term98564.getClass(), "userName", "ruVLkwVHZZ");
        setIntField(term98564, term98564.getClass(), "level", 1734631443);
        setLongField(term98564, term98564.getClass(), "exp", -6467775953887908035L);
        setLongField(term98564, term98564.getClass(), "point", 8069460781470355666L);
        setLongField(term98564, term98564.getClass(), "totalPoint", -4781712160480416181L);
        setIntField(term98564, term98564.getClass(), "playCount", 1849033992);
        setIntField(term98564, term98564.getClass(), "jewelCount", 2024051849);
        setIntField(term98564, term98564.getClass(), "totalJewelCount", -861723623);
        setIntField(term98564, term98564.getClass(), "playerRating", 496159678);
        setIntField(term98564, term98564.getClass(), "highestRating", 1276659733);
        setIntField(term98564, term98564.getClass(), "battlePoint", -1291400151);
        setIntField(term98564, term98564.getClass(), "nameplateId", 1243558732);
        setIntField(term98564, term98564.getClass(), "trophyId", -1080536959);
        setIntField(term98564, term98564.getClass(), "cardId", -2133284530);
        setIntField(term98564, term98564.getClass(), "characterId", -1891876210);
        setLongField(term98564, term98564.getClass(), "sumTechHighScore", -3409203382397558369L);
        setLongField(term98564, term98564.getClass(), "sumTechBasicHighScore", -706932922347507004L);
        setLongField(term98564, term98564.getClass(), "sumTechAdvancedHighScore", -1764385305518281595L);
        setLongField(term98564, term98564.getClass(), "sumTechExpertHighScore", 724528748480602014L);
        setLongField(term98564, term98564.getClass(), "sumTechMasterHighScore", -264339565166876549L);
        setLongField(term98564, term98564.getClass(), "sumTechLunaticHighScore", 5501480431698388561L);
        setLongField(term98564, term98564.getClass(), "sumBattleHighScore", -2640962884574063003L);
        setLongField(term98564, term98564.getClass(), "sumBattleBasicHighScore", 6104247605242922173L);
        setLongField(term98564, term98564.getClass(), "sumBattleAdvancedHighScore", 4660674450759289749L);
        setLongField(term98564, term98564.getClass(), "sumBattleExpertHighScore", -8321604432925049526L);
        setLongField(term98564, term98564.getClass(), "sumBattleMasterHighScore", 567012735639740565L);
        setLongField(term98564, term98564.getClass(), "sumBattleLunaticHighScore", -3855917769840841392L);
        term98603 = new Long(-6748352254616500189L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98603;
        callMethod(klass, "setSumBattleHighScore", argTypes, term98564, args);
    }

};


