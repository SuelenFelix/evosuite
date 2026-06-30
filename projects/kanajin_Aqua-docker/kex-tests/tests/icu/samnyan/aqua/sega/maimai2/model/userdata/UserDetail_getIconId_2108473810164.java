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

public class UserDetail_getIconId_2108473810164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4320554;

    public UserDetail_getIconId_2108473810164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4320554 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term4320554, term4320554.getClass(), "id", 0L);
        setField(term4320554, term4320554.getClass(), "card", null);
        setField(term4320554, term4320554.getClass(), "userName", null);
        setIntField(term4320554, term4320554.getClass(), "isNetMember", 0);
        setIntField(term4320554, term4320554.getClass(), "iconId", 0);
        setIntField(term4320554, term4320554.getClass(), "plateId", 0);
        setIntField(term4320554, term4320554.getClass(), "titleId", 0);
        setIntField(term4320554, term4320554.getClass(), "partnerId", 0);
        setIntField(term4320554, term4320554.getClass(), "frameId", 0);
        setIntField(term4320554, term4320554.getClass(), "selectMapId", 0);
        setIntField(term4320554, term4320554.getClass(), "totalAwake", 0);
        setIntField(term4320554, term4320554.getClass(), "gradeRating", 0);
        setIntField(term4320554, term4320554.getClass(), "musicRating", 0);
        setIntField(term4320554, term4320554.getClass(), "playerRating", 0);
        setIntField(term4320554, term4320554.getClass(), "highestRating", 0);
        setIntField(term4320554, term4320554.getClass(), "gradeRank", 0);
        setIntField(term4320554, term4320554.getClass(), "classRank", 0);
        setIntField(term4320554, term4320554.getClass(), "courseRank", 0);
        setField(term4320554, term4320554.getClass(), "charaSlot", null);
        setField(term4320554, term4320554.getClass(), "charaLockSlot", null);
        setLongField(term4320554, term4320554.getClass(), "contentBit", 0L);
        setIntField(term4320554, term4320554.getClass(), "playCount", 0);
        setField(term4320554, term4320554.getClass(), "eventWatchedDate", null);
        setField(term4320554, term4320554.getClass(), "lastGameId", null);
        setField(term4320554, term4320554.getClass(), "lastRomVersion", null);
        setField(term4320554, term4320554.getClass(), "lastDataVersion", null);
        setField(term4320554, term4320554.getClass(), "lastLoginDate", null);
        setField(term4320554, term4320554.getClass(), "lastPlayDate", null);
        setIntField(term4320554, term4320554.getClass(), "lastPlayCredit", 0);
        setIntField(term4320554, term4320554.getClass(), "lastPlayMode", 0);
        setIntField(term4320554, term4320554.getClass(), "lastPlaceId", 0);
        setField(term4320554, term4320554.getClass(), "lastPlaceName", null);
        setIntField(term4320554, term4320554.getClass(), "lastAllNetId", 0);
        setIntField(term4320554, term4320554.getClass(), "lastRegionId", 0);
        setField(term4320554, term4320554.getClass(), "lastRegionName", null);
        setField(term4320554, term4320554.getClass(), "lastClientId", null);
        setField(term4320554, term4320554.getClass(), "lastCountryCode", null);
        setIntField(term4320554, term4320554.getClass(), "lastSelectEMoney", 0);
        setIntField(term4320554, term4320554.getClass(), "lastSelectTicket", 0);
        setIntField(term4320554, term4320554.getClass(), "lastSelectCourse", 0);
        setIntField(term4320554, term4320554.getClass(), "lastCountCourse", 0);
        setField(term4320554, term4320554.getClass(), "firstGameId", null);
        setField(term4320554, term4320554.getClass(), "firstRomVersion", null);
        setField(term4320554, term4320554.getClass(), "firstDataVersion", null);
        setField(term4320554, term4320554.getClass(), "firstPlayDate", null);
        setField(term4320554, term4320554.getClass(), "compatibleCmVersion", null);
        setField(term4320554, term4320554.getClass(), "dailyBonusDate", null);
        setField(term4320554, term4320554.getClass(), "dailyCourseBonusDate", null);
        setField(term4320554, term4320554.getClass(), "lastPairLoginDate", null);
        setField(term4320554, term4320554.getClass(), "lastTrialPlayDate", null);
        setIntField(term4320554, term4320554.getClass(), "playVsCount", 0);
        setIntField(term4320554, term4320554.getClass(), "playSyncCount", 0);
        setIntField(term4320554, term4320554.getClass(), "winCount", 0);
        setIntField(term4320554, term4320554.getClass(), "helpCount", 0);
        setIntField(term4320554, term4320554.getClass(), "comboCount", 0);
        setLongField(term4320554, term4320554.getClass(), "totalDeluxscore", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term4320554, term4320554.getClass(), "totalSync", 0);
        setIntField(term4320554, term4320554.getClass(), "totalBasicSync", 0);
        setIntField(term4320554, term4320554.getClass(), "totalAdvancedSync", 0);
        setIntField(term4320554, term4320554.getClass(), "totalExpertSync", 0);
        setIntField(term4320554, term4320554.getClass(), "totalMasterSync", 0);
        setIntField(term4320554, term4320554.getClass(), "totalReMasterSync", 0);
        setLongField(term4320554, term4320554.getClass(), "totalAchievement", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalBasicAchievement", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalExpertAchievement", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalMasterAchievement", 0L);
        setLongField(term4320554, term4320554.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term4320554, term4320554.getClass(), "playerOldRating", 0L);
        setLongField(term4320554, term4320554.getClass(), "playerNewRating", 0L);
        setIntField(term4320554, term4320554.getClass(), "banState", 0);
        setLongField(term4320554, term4320554.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term4320554, args);
    }

};


