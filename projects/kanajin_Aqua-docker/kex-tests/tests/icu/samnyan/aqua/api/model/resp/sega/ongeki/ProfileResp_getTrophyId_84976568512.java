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

public class ProfileResp_getTrophyId_84976568512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96738;

    public ProfileResp_getTrophyId_84976568512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96738 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96738, term96738.getClass(), "userName", "FUUrETeqTW");
        setIntField(term96738, term96738.getClass(), "level", -1819851231);
        setLongField(term96738, term96738.getClass(), "exp", -4005828385271750251L);
        setLongField(term96738, term96738.getClass(), "point", 6749474520579652998L);
        setLongField(term96738, term96738.getClass(), "totalPoint", 2301209664232124921L);
        setIntField(term96738, term96738.getClass(), "playCount", -313309611);
        setIntField(term96738, term96738.getClass(), "jewelCount", -1848587569);
        setIntField(term96738, term96738.getClass(), "totalJewelCount", 2095596087);
        setIntField(term96738, term96738.getClass(), "playerRating", 615602172);
        setIntField(term96738, term96738.getClass(), "highestRating", 516647715);
        setIntField(term96738, term96738.getClass(), "battlePoint", 795193615);
        setIntField(term96738, term96738.getClass(), "nameplateId", -1668935329);
        setIntField(term96738, term96738.getClass(), "trophyId", -774184177);
        setIntField(term96738, term96738.getClass(), "cardId", 1285096752);
        setIntField(term96738, term96738.getClass(), "characterId", -1356985078);
        setLongField(term96738, term96738.getClass(), "sumTechHighScore", 4816798014595709050L);
        setLongField(term96738, term96738.getClass(), "sumTechBasicHighScore", -5083481370084073907L);
        setLongField(term96738, term96738.getClass(), "sumTechAdvancedHighScore", 4442815134458583731L);
        setLongField(term96738, term96738.getClass(), "sumTechExpertHighScore", 236867616603711542L);
        setLongField(term96738, term96738.getClass(), "sumTechMasterHighScore", -2657684679287156727L);
        setLongField(term96738, term96738.getClass(), "sumTechLunaticHighScore", -1199100702736789765L);
        setLongField(term96738, term96738.getClass(), "sumBattleHighScore", -6355125531843490414L);
        setLongField(term96738, term96738.getClass(), "sumBattleBasicHighScore", 63184321465033031L);
        setLongField(term96738, term96738.getClass(), "sumBattleAdvancedHighScore", 4161342594538013440L);
        setLongField(term96738, term96738.getClass(), "sumBattleExpertHighScore", 1312631357330663214L);
        setLongField(term96738, term96738.getClass(), "sumBattleMasterHighScore", 713741022574034502L);
        setLongField(term96738, term96738.getClass(), "sumBattleLunaticHighScore", 2684889914049833069L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term96738, args);
    }

};


