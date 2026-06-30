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

public class UserDetail_getComboCount_2079552449214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289131;

    public UserDetail_getComboCount_2079552449214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289131, term289131.getClass(), "id", 0L);
        setField(term289131, term289131.getClass(), "card", null);
        setField(term289131, term289131.getClass(), "userName", null);
        setIntField(term289131, term289131.getClass(), "isNetMember", 0);
        setIntField(term289131, term289131.getClass(), "iconId", 0);
        setIntField(term289131, term289131.getClass(), "plateId", 0);
        setIntField(term289131, term289131.getClass(), "titleId", 0);
        setIntField(term289131, term289131.getClass(), "partnerId", 0);
        setIntField(term289131, term289131.getClass(), "frameId", 0);
        setIntField(term289131, term289131.getClass(), "selectMapId", 0);
        setIntField(term289131, term289131.getClass(), "totalAwake", 0);
        setIntField(term289131, term289131.getClass(), "gradeRating", 0);
        setIntField(term289131, term289131.getClass(), "musicRating", 0);
        setIntField(term289131, term289131.getClass(), "playerRating", 0);
        setIntField(term289131, term289131.getClass(), "highestRating", 0);
        setIntField(term289131, term289131.getClass(), "gradeRank", 0);
        setIntField(term289131, term289131.getClass(), "classRank", 0);
        setIntField(term289131, term289131.getClass(), "courseRank", 0);
        setField(term289131, term289131.getClass(), "charaSlot", null);
        setField(term289131, term289131.getClass(), "charaLockSlot", null);
        setLongField(term289131, term289131.getClass(), "contentBit", 0L);
        setIntField(term289131, term289131.getClass(), "playCount", 0);
        setField(term289131, term289131.getClass(), "eventWatchedDate", null);
        setField(term289131, term289131.getClass(), "lastGameId", null);
        setField(term289131, term289131.getClass(), "lastRomVersion", null);
        setField(term289131, term289131.getClass(), "lastDataVersion", null);
        setField(term289131, term289131.getClass(), "lastLoginDate", null);
        setField(term289131, term289131.getClass(), "lastPlayDate", null);
        setIntField(term289131, term289131.getClass(), "lastPlayCredit", 0);
        setIntField(term289131, term289131.getClass(), "lastPlayMode", 0);
        setIntField(term289131, term289131.getClass(), "lastPlaceId", 0);
        setField(term289131, term289131.getClass(), "lastPlaceName", null);
        setIntField(term289131, term289131.getClass(), "lastAllNetId", 0);
        setIntField(term289131, term289131.getClass(), "lastRegionId", 0);
        setField(term289131, term289131.getClass(), "lastRegionName", null);
        setField(term289131, term289131.getClass(), "lastClientId", null);
        setField(term289131, term289131.getClass(), "lastCountryCode", null);
        setIntField(term289131, term289131.getClass(), "lastSelectEMoney", 0);
        setIntField(term289131, term289131.getClass(), "lastSelectTicket", 0);
        setIntField(term289131, term289131.getClass(), "lastSelectCourse", 0);
        setIntField(term289131, term289131.getClass(), "lastCountCourse", 0);
        setField(term289131, term289131.getClass(), "firstGameId", null);
        setField(term289131, term289131.getClass(), "firstRomVersion", null);
        setField(term289131, term289131.getClass(), "firstDataVersion", null);
        setField(term289131, term289131.getClass(), "firstPlayDate", null);
        setField(term289131, term289131.getClass(), "compatibleCmVersion", null);
        setField(term289131, term289131.getClass(), "dailyBonusDate", null);
        setField(term289131, term289131.getClass(), "dailyCourseBonusDate", null);
        setField(term289131, term289131.getClass(), "lastPairLoginDate", null);
        setField(term289131, term289131.getClass(), "lastTrialPlayDate", null);
        setIntField(term289131, term289131.getClass(), "playVsCount", 0);
        setIntField(term289131, term289131.getClass(), "playSyncCount", 0);
        setIntField(term289131, term289131.getClass(), "winCount", 0);
        setIntField(term289131, term289131.getClass(), "helpCount", 0);
        setIntField(term289131, term289131.getClass(), "comboCount", 0);
        setLongField(term289131, term289131.getClass(), "totalDeluxscore", 0L);
        setLongField(term289131, term289131.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289131, term289131.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289131, term289131.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289131, term289131.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289131, term289131.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289131, term289131.getClass(), "totalSync", 0);
        setIntField(term289131, term289131.getClass(), "totalBasicSync", 0);
        setIntField(term289131, term289131.getClass(), "totalAdvancedSync", 0);
        setIntField(term289131, term289131.getClass(), "totalExpertSync", 0);
        setIntField(term289131, term289131.getClass(), "totalMasterSync", 0);
        setIntField(term289131, term289131.getClass(), "totalReMasterSync", 0);
        setLongField(term289131, term289131.getClass(), "totalAchievement", 0L);
        setLongField(term289131, term289131.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289131, term289131.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289131, term289131.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289131, term289131.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289131, term289131.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289131, term289131.getClass(), "playerOldRating", 0L);
        setLongField(term289131, term289131.getClass(), "playerNewRating", 0L);
        setIntField(term289131, term289131.getClass(), "banState", 0);
        setLongField(term289131, term289131.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboCount", argTypes, term289131, args);
    }

};


