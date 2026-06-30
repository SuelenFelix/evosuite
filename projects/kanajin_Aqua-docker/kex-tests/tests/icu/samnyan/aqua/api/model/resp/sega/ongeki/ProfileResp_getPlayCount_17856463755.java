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

public class ProfileResp_getPlayCount_17856463755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96395;

    public ProfileResp_getPlayCount_17856463755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96395 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96395, term96395.getClass(), "userName", "DMjjqwPHKr");
        setIntField(term96395, term96395.getClass(), "level", 444072001);
        setLongField(term96395, term96395.getClass(), "exp", -8427798782945486577L);
        setLongField(term96395, term96395.getClass(), "point", -8939611260364249555L);
        setLongField(term96395, term96395.getClass(), "totalPoint", 486809775933281158L);
        setIntField(term96395, term96395.getClass(), "playCount", -1232584538);
        setIntField(term96395, term96395.getClass(), "jewelCount", -1040580703);
        setIntField(term96395, term96395.getClass(), "totalJewelCount", -1742770063);
        setIntField(term96395, term96395.getClass(), "playerRating", -505500834);
        setIntField(term96395, term96395.getClass(), "highestRating", 1711683822);
        setIntField(term96395, term96395.getClass(), "battlePoint", 387645741);
        setIntField(term96395, term96395.getClass(), "nameplateId", -1113205506);
        setIntField(term96395, term96395.getClass(), "trophyId", -1820868543);
        setIntField(term96395, term96395.getClass(), "cardId", 419828177);
        setIntField(term96395, term96395.getClass(), "characterId", 2122747372);
        setLongField(term96395, term96395.getClass(), "sumTechHighScore", -2360291257196558995L);
        setLongField(term96395, term96395.getClass(), "sumTechBasicHighScore", -6779467491727073995L);
        setLongField(term96395, term96395.getClass(), "sumTechAdvancedHighScore", 8422506845939017887L);
        setLongField(term96395, term96395.getClass(), "sumTechExpertHighScore", 5407073192977748514L);
        setLongField(term96395, term96395.getClass(), "sumTechMasterHighScore", -7552384471304384283L);
        setLongField(term96395, term96395.getClass(), "sumTechLunaticHighScore", -5881864128557828709L);
        setLongField(term96395, term96395.getClass(), "sumBattleHighScore", -6537019787724760657L);
        setLongField(term96395, term96395.getClass(), "sumBattleBasicHighScore", 1817418065261000790L);
        setLongField(term96395, term96395.getClass(), "sumBattleAdvancedHighScore", 1945027355281057156L);
        setLongField(term96395, term96395.getClass(), "sumBattleExpertHighScore", 3370630482381339865L);
        setLongField(term96395, term96395.getClass(), "sumBattleMasterHighScore", 8672067880957285121L);
        setLongField(term96395, term96395.getClass(), "sumBattleLunaticHighScore", 3364039392435306012L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term96395, args);
    }

};


