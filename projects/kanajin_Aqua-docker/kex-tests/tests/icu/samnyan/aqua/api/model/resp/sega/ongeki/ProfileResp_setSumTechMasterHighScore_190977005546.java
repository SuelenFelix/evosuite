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

public class ProfileResp_setSumTechMasterHighScore_190977005546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98462;
     Object term98501;

    public ProfileResp_setSumTechMasterHighScore_190977005546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98462 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98462, term98462.getClass(), "userName", "ioEDElbWJy");
        setIntField(term98462, term98462.getClass(), "level", 517443387);
        setLongField(term98462, term98462.getClass(), "exp", -4176652691249199259L);
        setLongField(term98462, term98462.getClass(), "point", -5281821170218750265L);
        setLongField(term98462, term98462.getClass(), "totalPoint", 3385472837842448275L);
        setIntField(term98462, term98462.getClass(), "playCount", 1853805746);
        setIntField(term98462, term98462.getClass(), "jewelCount", -1671563569);
        setIntField(term98462, term98462.getClass(), "totalJewelCount", 855691328);
        setIntField(term98462, term98462.getClass(), "playerRating", -41960698);
        setIntField(term98462, term98462.getClass(), "highestRating", -1188711158);
        setIntField(term98462, term98462.getClass(), "battlePoint", 1842445056);
        setIntField(term98462, term98462.getClass(), "nameplateId", -1536694952);
        setIntField(term98462, term98462.getClass(), "trophyId", 2041310422);
        setIntField(term98462, term98462.getClass(), "cardId", 1438706959);
        setIntField(term98462, term98462.getClass(), "characterId", 42887595);
        setLongField(term98462, term98462.getClass(), "sumTechHighScore", -7404536129809980737L);
        setLongField(term98462, term98462.getClass(), "sumTechBasicHighScore", 2669208122397609272L);
        setLongField(term98462, term98462.getClass(), "sumTechAdvancedHighScore", 176806626668624673L);
        setLongField(term98462, term98462.getClass(), "sumTechExpertHighScore", -3699280856911503290L);
        setLongField(term98462, term98462.getClass(), "sumTechMasterHighScore", -3180129706405729726L);
        setLongField(term98462, term98462.getClass(), "sumTechLunaticHighScore", 5775461462976695025L);
        setLongField(term98462, term98462.getClass(), "sumBattleHighScore", 6397334634655139359L);
        setLongField(term98462, term98462.getClass(), "sumBattleBasicHighScore", -4344083315626652780L);
        setLongField(term98462, term98462.getClass(), "sumBattleAdvancedHighScore", -3763600317941289238L);
        setLongField(term98462, term98462.getClass(), "sumBattleExpertHighScore", 5244740187149398229L);
        setLongField(term98462, term98462.getClass(), "sumBattleMasterHighScore", 718471511380285893L);
        setLongField(term98462, term98462.getClass(), "sumBattleLunaticHighScore", -3607019980089365498L);
        term98501 = new Long(822276414731142092L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98501;
        callMethod(klass, "setSumTechMasterHighScore", argTypes, term98462, args);
    }

};


