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

public class ProfileResp_getNameplateId_38868102811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96689;

    public ProfileResp_getNameplateId_38868102811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96689 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96689, term96689.getClass(), "userName", "SOBVESgXhD");
        setIntField(term96689, term96689.getClass(), "level", -882008098);
        setLongField(term96689, term96689.getClass(), "exp", -1341085010950034925L);
        setLongField(term96689, term96689.getClass(), "point", 616685953376216886L);
        setLongField(term96689, term96689.getClass(), "totalPoint", -5782280918998415581L);
        setIntField(term96689, term96689.getClass(), "playCount", 674551844);
        setIntField(term96689, term96689.getClass(), "jewelCount", -917520325);
        setIntField(term96689, term96689.getClass(), "totalJewelCount", -431923372);
        setIntField(term96689, term96689.getClass(), "playerRating", -1534337016);
        setIntField(term96689, term96689.getClass(), "highestRating", 1248651458);
        setIntField(term96689, term96689.getClass(), "battlePoint", 1231104902);
        setIntField(term96689, term96689.getClass(), "nameplateId", 2007689969);
        setIntField(term96689, term96689.getClass(), "trophyId", -1461289174);
        setIntField(term96689, term96689.getClass(), "cardId", -878470833);
        setIntField(term96689, term96689.getClass(), "characterId", -2076739116);
        setLongField(term96689, term96689.getClass(), "sumTechHighScore", 4190330462137805041L);
        setLongField(term96689, term96689.getClass(), "sumTechBasicHighScore", 243764973558315129L);
        setLongField(term96689, term96689.getClass(), "sumTechAdvancedHighScore", -3816266606097444666L);
        setLongField(term96689, term96689.getClass(), "sumTechExpertHighScore", -7814459956251530195L);
        setLongField(term96689, term96689.getClass(), "sumTechMasterHighScore", 6018074396439131498L);
        setLongField(term96689, term96689.getClass(), "sumTechLunaticHighScore", -2758159044747427982L);
        setLongField(term96689, term96689.getClass(), "sumBattleHighScore", -266203687406320169L);
        setLongField(term96689, term96689.getClass(), "sumBattleBasicHighScore", -1956255898200543753L);
        setLongField(term96689, term96689.getClass(), "sumBattleAdvancedHighScore", 7688630631976149323L);
        setLongField(term96689, term96689.getClass(), "sumBattleExpertHighScore", 544278422376780687L);
        setLongField(term96689, term96689.getClass(), "sumBattleMasterHighScore", -546547651222754410L);
        setLongField(term96689, term96689.getClass(), "sumBattleLunaticHighScore", 3300349739333444627L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term96689, args);
    }

};


