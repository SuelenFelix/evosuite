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

public class UserDetail_getLastCountryCode_335755516196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288141;

    public UserDetail_getLastCountryCode_335755516196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288141 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288141, term288141.getClass(), "id", 0L);
        setField(term288141, term288141.getClass(), "card", null);
        setField(term288141, term288141.getClass(), "userName", null);
        setIntField(term288141, term288141.getClass(), "isNetMember", 0);
        setIntField(term288141, term288141.getClass(), "iconId", 0);
        setIntField(term288141, term288141.getClass(), "plateId", 0);
        setIntField(term288141, term288141.getClass(), "titleId", 0);
        setIntField(term288141, term288141.getClass(), "partnerId", 0);
        setIntField(term288141, term288141.getClass(), "frameId", 0);
        setIntField(term288141, term288141.getClass(), "selectMapId", 0);
        setIntField(term288141, term288141.getClass(), "totalAwake", 0);
        setIntField(term288141, term288141.getClass(), "gradeRating", 0);
        setIntField(term288141, term288141.getClass(), "musicRating", 0);
        setIntField(term288141, term288141.getClass(), "playerRating", 0);
        setIntField(term288141, term288141.getClass(), "highestRating", 0);
        setIntField(term288141, term288141.getClass(), "gradeRank", 0);
        setIntField(term288141, term288141.getClass(), "classRank", 0);
        setIntField(term288141, term288141.getClass(), "courseRank", 0);
        setField(term288141, term288141.getClass(), "charaSlot", null);
        setField(term288141, term288141.getClass(), "charaLockSlot", null);
        setLongField(term288141, term288141.getClass(), "contentBit", 0L);
        setIntField(term288141, term288141.getClass(), "playCount", 0);
        setField(term288141, term288141.getClass(), "eventWatchedDate", null);
        setField(term288141, term288141.getClass(), "lastGameId", null);
        setField(term288141, term288141.getClass(), "lastRomVersion", null);
        setField(term288141, term288141.getClass(), "lastDataVersion", null);
        setField(term288141, term288141.getClass(), "lastLoginDate", null);
        setField(term288141, term288141.getClass(), "lastPlayDate", null);
        setIntField(term288141, term288141.getClass(), "lastPlayCredit", 0);
        setIntField(term288141, term288141.getClass(), "lastPlayMode", 0);
        setIntField(term288141, term288141.getClass(), "lastPlaceId", 0);
        setField(term288141, term288141.getClass(), "lastPlaceName", null);
        setIntField(term288141, term288141.getClass(), "lastAllNetId", 0);
        setIntField(term288141, term288141.getClass(), "lastRegionId", 0);
        setField(term288141, term288141.getClass(), "lastRegionName", null);
        setField(term288141, term288141.getClass(), "lastClientId", null);
        setField(term288141, term288141.getClass(), "lastCountryCode", null);
        setIntField(term288141, term288141.getClass(), "lastSelectEMoney", 0);
        setIntField(term288141, term288141.getClass(), "lastSelectTicket", 0);
        setIntField(term288141, term288141.getClass(), "lastSelectCourse", 0);
        setIntField(term288141, term288141.getClass(), "lastCountCourse", 0);
        setField(term288141, term288141.getClass(), "firstGameId", null);
        setField(term288141, term288141.getClass(), "firstRomVersion", null);
        setField(term288141, term288141.getClass(), "firstDataVersion", null);
        setField(term288141, term288141.getClass(), "firstPlayDate", null);
        setField(term288141, term288141.getClass(), "compatibleCmVersion", null);
        setField(term288141, term288141.getClass(), "dailyBonusDate", null);
        setField(term288141, term288141.getClass(), "dailyCourseBonusDate", null);
        setField(term288141, term288141.getClass(), "lastPairLoginDate", null);
        setField(term288141, term288141.getClass(), "lastTrialPlayDate", null);
        setIntField(term288141, term288141.getClass(), "playVsCount", 0);
        setIntField(term288141, term288141.getClass(), "playSyncCount", 0);
        setIntField(term288141, term288141.getClass(), "winCount", 0);
        setIntField(term288141, term288141.getClass(), "helpCount", 0);
        setIntField(term288141, term288141.getClass(), "comboCount", 0);
        setLongField(term288141, term288141.getClass(), "totalDeluxscore", 0L);
        setLongField(term288141, term288141.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288141, term288141.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288141, term288141.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288141, term288141.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288141, term288141.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288141, term288141.getClass(), "totalSync", 0);
        setIntField(term288141, term288141.getClass(), "totalBasicSync", 0);
        setIntField(term288141, term288141.getClass(), "totalAdvancedSync", 0);
        setIntField(term288141, term288141.getClass(), "totalExpertSync", 0);
        setIntField(term288141, term288141.getClass(), "totalMasterSync", 0);
        setIntField(term288141, term288141.getClass(), "totalReMasterSync", 0);
        setLongField(term288141, term288141.getClass(), "totalAchievement", 0L);
        setLongField(term288141, term288141.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288141, term288141.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288141, term288141.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288141, term288141.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288141, term288141.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288141, term288141.getClass(), "playerOldRating", 0L);
        setLongField(term288141, term288141.getClass(), "playerNewRating", 0L);
        setIntField(term288141, term288141.getClass(), "banState", 0);
        setLongField(term288141, term288141.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastCountryCode", argTypes, term288141, args);
    }

};


