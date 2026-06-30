package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDetail_getLastClientId_295120449195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288086;

    public UserDetail_getLastClientId_295120449195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288086 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288086, term288086.getClass(), "id", 0L);
        setField(term288086, term288086.getClass(), "card", null);
        setField(term288086, term288086.getClass(), "userName", null);
        setIntField(term288086, term288086.getClass(), "isNetMember", 0);
        setIntField(term288086, term288086.getClass(), "iconId", 0);
        setIntField(term288086, term288086.getClass(), "plateId", 0);
        setIntField(term288086, term288086.getClass(), "titleId", 0);
        setIntField(term288086, term288086.getClass(), "partnerId", 0);
        setIntField(term288086, term288086.getClass(), "frameId", 0);
        setIntField(term288086, term288086.getClass(), "selectMapId", 0);
        setIntField(term288086, term288086.getClass(), "totalAwake", 0);
        setIntField(term288086, term288086.getClass(), "gradeRating", 0);
        setIntField(term288086, term288086.getClass(), "musicRating", 0);
        setIntField(term288086, term288086.getClass(), "playerRating", 0);
        setIntField(term288086, term288086.getClass(), "highestRating", 0);
        setIntField(term288086, term288086.getClass(), "gradeRank", 0);
        setIntField(term288086, term288086.getClass(), "classRank", 0);
        setIntField(term288086, term288086.getClass(), "courseRank", 0);
        setField(term288086, term288086.getClass(), "charaSlot", null);
        setField(term288086, term288086.getClass(), "charaLockSlot", null);
        setLongField(term288086, term288086.getClass(), "contentBit", 0L);
        setIntField(term288086, term288086.getClass(), "playCount", 0);
        setField(term288086, term288086.getClass(), "eventWatchedDate", null);
        setField(term288086, term288086.getClass(), "lastGameId", null);
        setField(term288086, term288086.getClass(), "lastRomVersion", null);
        setField(term288086, term288086.getClass(), "lastDataVersion", null);
        setField(term288086, term288086.getClass(), "lastLoginDate", null);
        setField(term288086, term288086.getClass(), "lastPlayDate", null);
        setIntField(term288086, term288086.getClass(), "lastPlayCredit", 0);
        setIntField(term288086, term288086.getClass(), "lastPlayMode", 0);
        setIntField(term288086, term288086.getClass(), "lastPlaceId", 0);
        setField(term288086, term288086.getClass(), "lastPlaceName", null);
        setIntField(term288086, term288086.getClass(), "lastAllNetId", 0);
        setIntField(term288086, term288086.getClass(), "lastRegionId", 0);
        setField(term288086, term288086.getClass(), "lastRegionName", null);
        setField(term288086, term288086.getClass(), "lastClientId", null);
        setField(term288086, term288086.getClass(), "lastCountryCode", null);
        setIntField(term288086, term288086.getClass(), "lastSelectEMoney", 0);
        setIntField(term288086, term288086.getClass(), "lastSelectTicket", 0);
        setIntField(term288086, term288086.getClass(), "lastSelectCourse", 0);
        setIntField(term288086, term288086.getClass(), "lastCountCourse", 0);
        setField(term288086, term288086.getClass(), "firstGameId", null);
        setField(term288086, term288086.getClass(), "firstRomVersion", null);
        setField(term288086, term288086.getClass(), "firstDataVersion", null);
        setField(term288086, term288086.getClass(), "firstPlayDate", null);
        setField(term288086, term288086.getClass(), "compatibleCmVersion", null);
        setField(term288086, term288086.getClass(), "dailyBonusDate", null);
        setField(term288086, term288086.getClass(), "dailyCourseBonusDate", null);
        setField(term288086, term288086.getClass(), "lastPairLoginDate", null);
        setField(term288086, term288086.getClass(), "lastTrialPlayDate", null);
        setIntField(term288086, term288086.getClass(), "playVsCount", 0);
        setIntField(term288086, term288086.getClass(), "playSyncCount", 0);
        setIntField(term288086, term288086.getClass(), "winCount", 0);
        setIntField(term288086, term288086.getClass(), "helpCount", 0);
        setIntField(term288086, term288086.getClass(), "comboCount", 0);
        setLongField(term288086, term288086.getClass(), "totalDeluxscore", 0L);
        setLongField(term288086, term288086.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288086, term288086.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288086, term288086.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288086, term288086.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288086, term288086.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288086, term288086.getClass(), "totalSync", 0);
        setIntField(term288086, term288086.getClass(), "totalBasicSync", 0);
        setIntField(term288086, term288086.getClass(), "totalAdvancedSync", 0);
        setIntField(term288086, term288086.getClass(), "totalExpertSync", 0);
        setIntField(term288086, term288086.getClass(), "totalMasterSync", 0);
        setIntField(term288086, term288086.getClass(), "totalReMasterSync", 0);
        setLongField(term288086, term288086.getClass(), "totalAchievement", 0L);
        setLongField(term288086, term288086.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288086, term288086.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288086, term288086.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288086, term288086.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288086, term288086.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288086, term288086.getClass(), "playerOldRating", 0L);
        setLongField(term288086, term288086.getClass(), "playerNewRating", 0L);
        setIntField(term288086, term288086.getClass(), "banState", 0);
        setLongField(term288086, term288086.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term288086, args);
    }

};


