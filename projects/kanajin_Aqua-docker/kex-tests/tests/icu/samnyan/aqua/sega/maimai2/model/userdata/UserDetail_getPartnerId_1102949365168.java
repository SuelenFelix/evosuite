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

public class UserDetail_getPartnerId_1102949365168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286601;

    public UserDetail_getPartnerId_1102949365168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286601, term286601.getClass(), "id", 0L);
        setField(term286601, term286601.getClass(), "card", null);
        setField(term286601, term286601.getClass(), "userName", null);
        setIntField(term286601, term286601.getClass(), "isNetMember", 0);
        setIntField(term286601, term286601.getClass(), "iconId", 0);
        setIntField(term286601, term286601.getClass(), "plateId", 0);
        setIntField(term286601, term286601.getClass(), "titleId", 0);
        setIntField(term286601, term286601.getClass(), "partnerId", 0);
        setIntField(term286601, term286601.getClass(), "frameId", 0);
        setIntField(term286601, term286601.getClass(), "selectMapId", 0);
        setIntField(term286601, term286601.getClass(), "totalAwake", 0);
        setIntField(term286601, term286601.getClass(), "gradeRating", 0);
        setIntField(term286601, term286601.getClass(), "musicRating", 0);
        setIntField(term286601, term286601.getClass(), "playerRating", 0);
        setIntField(term286601, term286601.getClass(), "highestRating", 0);
        setIntField(term286601, term286601.getClass(), "gradeRank", 0);
        setIntField(term286601, term286601.getClass(), "classRank", 0);
        setIntField(term286601, term286601.getClass(), "courseRank", 0);
        setField(term286601, term286601.getClass(), "charaSlot", null);
        setField(term286601, term286601.getClass(), "charaLockSlot", null);
        setLongField(term286601, term286601.getClass(), "contentBit", 0L);
        setIntField(term286601, term286601.getClass(), "playCount", 0);
        setField(term286601, term286601.getClass(), "eventWatchedDate", null);
        setField(term286601, term286601.getClass(), "lastGameId", null);
        setField(term286601, term286601.getClass(), "lastRomVersion", null);
        setField(term286601, term286601.getClass(), "lastDataVersion", null);
        setField(term286601, term286601.getClass(), "lastLoginDate", null);
        setField(term286601, term286601.getClass(), "lastPlayDate", null);
        setIntField(term286601, term286601.getClass(), "lastPlayCredit", 0);
        setIntField(term286601, term286601.getClass(), "lastPlayMode", 0);
        setIntField(term286601, term286601.getClass(), "lastPlaceId", 0);
        setField(term286601, term286601.getClass(), "lastPlaceName", null);
        setIntField(term286601, term286601.getClass(), "lastAllNetId", 0);
        setIntField(term286601, term286601.getClass(), "lastRegionId", 0);
        setField(term286601, term286601.getClass(), "lastRegionName", null);
        setField(term286601, term286601.getClass(), "lastClientId", null);
        setField(term286601, term286601.getClass(), "lastCountryCode", null);
        setIntField(term286601, term286601.getClass(), "lastSelectEMoney", 0);
        setIntField(term286601, term286601.getClass(), "lastSelectTicket", 0);
        setIntField(term286601, term286601.getClass(), "lastSelectCourse", 0);
        setIntField(term286601, term286601.getClass(), "lastCountCourse", 0);
        setField(term286601, term286601.getClass(), "firstGameId", null);
        setField(term286601, term286601.getClass(), "firstRomVersion", null);
        setField(term286601, term286601.getClass(), "firstDataVersion", null);
        setField(term286601, term286601.getClass(), "firstPlayDate", null);
        setField(term286601, term286601.getClass(), "compatibleCmVersion", null);
        setField(term286601, term286601.getClass(), "dailyBonusDate", null);
        setField(term286601, term286601.getClass(), "dailyCourseBonusDate", null);
        setField(term286601, term286601.getClass(), "lastPairLoginDate", null);
        setField(term286601, term286601.getClass(), "lastTrialPlayDate", null);
        setIntField(term286601, term286601.getClass(), "playVsCount", 0);
        setIntField(term286601, term286601.getClass(), "playSyncCount", 0);
        setIntField(term286601, term286601.getClass(), "winCount", 0);
        setIntField(term286601, term286601.getClass(), "helpCount", 0);
        setIntField(term286601, term286601.getClass(), "comboCount", 0);
        setLongField(term286601, term286601.getClass(), "totalDeluxscore", 0L);
        setLongField(term286601, term286601.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286601, term286601.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286601, term286601.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286601, term286601.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286601, term286601.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286601, term286601.getClass(), "totalSync", 0);
        setIntField(term286601, term286601.getClass(), "totalBasicSync", 0);
        setIntField(term286601, term286601.getClass(), "totalAdvancedSync", 0);
        setIntField(term286601, term286601.getClass(), "totalExpertSync", 0);
        setIntField(term286601, term286601.getClass(), "totalMasterSync", 0);
        setIntField(term286601, term286601.getClass(), "totalReMasterSync", 0);
        setLongField(term286601, term286601.getClass(), "totalAchievement", 0L);
        setLongField(term286601, term286601.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286601, term286601.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286601, term286601.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286601, term286601.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286601, term286601.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286601, term286601.getClass(), "playerOldRating", 0L);
        setLongField(term286601, term286601.getClass(), "playerNewRating", 0L);
        setIntField(term286601, term286601.getClass(), "banState", 0);
        setLongField(term286601, term286601.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartnerId", argTypes, term286601, args);
    }

};


