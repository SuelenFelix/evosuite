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

public class ProfileResp_getSumBattleLunaticHighScore_103097846526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97424;

    public ProfileResp_getSumBattleLunaticHighScore_103097846526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97424 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97424, term97424.getClass(), "userName", "pHRTNuwZAK");
        setIntField(term97424, term97424.getClass(), "level", -420212803);
        setLongField(term97424, term97424.getClass(), "exp", 7796989954227614941L);
        setLongField(term97424, term97424.getClass(), "point", -1918816021138029139L);
        setLongField(term97424, term97424.getClass(), "totalPoint", -8501869542785737410L);
        setIntField(term97424, term97424.getClass(), "playCount", -1221595426);
        setIntField(term97424, term97424.getClass(), "jewelCount", -1229130495);
        setIntField(term97424, term97424.getClass(), "totalJewelCount", -625962046);
        setIntField(term97424, term97424.getClass(), "playerRating", 1925446894);
        setIntField(term97424, term97424.getClass(), "highestRating", 931349709);
        setIntField(term97424, term97424.getClass(), "battlePoint", -1830201045);
        setIntField(term97424, term97424.getClass(), "nameplateId", 1900973862);
        setIntField(term97424, term97424.getClass(), "trophyId", 341596395);
        setIntField(term97424, term97424.getClass(), "cardId", 959936974);
        setIntField(term97424, term97424.getClass(), "characterId", 1065646105);
        setLongField(term97424, term97424.getClass(), "sumTechHighScore", -2212701068692712924L);
        setLongField(term97424, term97424.getClass(), "sumTechBasicHighScore", 4909635776702836261L);
        setLongField(term97424, term97424.getClass(), "sumTechAdvancedHighScore", -5609860175518526293L);
        setLongField(term97424, term97424.getClass(), "sumTechExpertHighScore", -3627446538264878781L);
        setLongField(term97424, term97424.getClass(), "sumTechMasterHighScore", -6514053203829171248L);
        setLongField(term97424, term97424.getClass(), "sumTechLunaticHighScore", -3439074291060147123L);
        setLongField(term97424, term97424.getClass(), "sumBattleHighScore", -1741932243177779617L);
        setLongField(term97424, term97424.getClass(), "sumBattleBasicHighScore", -3080935724128115456L);
        setLongField(term97424, term97424.getClass(), "sumBattleAdvancedHighScore", 156861999847786759L);
        setLongField(term97424, term97424.getClass(), "sumBattleExpertHighScore", 9196734911520469348L);
        setLongField(term97424, term97424.getClass(), "sumBattleMasterHighScore", -8786327085035228611L);
        setLongField(term97424, term97424.getClass(), "sumBattleLunaticHighScore", -612016812539807661L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleLunaticHighScore", argTypes, term97424, args);
    }

};


