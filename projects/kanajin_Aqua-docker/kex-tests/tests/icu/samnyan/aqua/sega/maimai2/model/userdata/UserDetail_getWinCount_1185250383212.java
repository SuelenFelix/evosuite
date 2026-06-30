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

public class UserDetail_getWinCount_1185250383212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289021;

    public UserDetail_getWinCount_1185250383212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term289021, term289021.getClass(), "id", 0L);
        setField(term289021, term289021.getClass(), "card", null);
        setField(term289021, term289021.getClass(), "userName", null);
        setIntField(term289021, term289021.getClass(), "isNetMember", 0);
        setIntField(term289021, term289021.getClass(), "iconId", 0);
        setIntField(term289021, term289021.getClass(), "plateId", 0);
        setIntField(term289021, term289021.getClass(), "titleId", 0);
        setIntField(term289021, term289021.getClass(), "partnerId", 0);
        setIntField(term289021, term289021.getClass(), "frameId", 0);
        setIntField(term289021, term289021.getClass(), "selectMapId", 0);
        setIntField(term289021, term289021.getClass(), "totalAwake", 0);
        setIntField(term289021, term289021.getClass(), "gradeRating", 0);
        setIntField(term289021, term289021.getClass(), "musicRating", 0);
        setIntField(term289021, term289021.getClass(), "playerRating", 0);
        setIntField(term289021, term289021.getClass(), "highestRating", 0);
        setIntField(term289021, term289021.getClass(), "gradeRank", 0);
        setIntField(term289021, term289021.getClass(), "classRank", 0);
        setIntField(term289021, term289021.getClass(), "courseRank", 0);
        setField(term289021, term289021.getClass(), "charaSlot", null);
        setField(term289021, term289021.getClass(), "charaLockSlot", null);
        setLongField(term289021, term289021.getClass(), "contentBit", 0L);
        setIntField(term289021, term289021.getClass(), "playCount", 0);
        setField(term289021, term289021.getClass(), "eventWatchedDate", null);
        setField(term289021, term289021.getClass(), "lastGameId", null);
        setField(term289021, term289021.getClass(), "lastRomVersion", null);
        setField(term289021, term289021.getClass(), "lastDataVersion", null);
        setField(term289021, term289021.getClass(), "lastLoginDate", null);
        setField(term289021, term289021.getClass(), "lastPlayDate", null);
        setIntField(term289021, term289021.getClass(), "lastPlayCredit", 0);
        setIntField(term289021, term289021.getClass(), "lastPlayMode", 0);
        setIntField(term289021, term289021.getClass(), "lastPlaceId", 0);
        setField(term289021, term289021.getClass(), "lastPlaceName", null);
        setIntField(term289021, term289021.getClass(), "lastAllNetId", 0);
        setIntField(term289021, term289021.getClass(), "lastRegionId", 0);
        setField(term289021, term289021.getClass(), "lastRegionName", null);
        setField(term289021, term289021.getClass(), "lastClientId", null);
        setField(term289021, term289021.getClass(), "lastCountryCode", null);
        setIntField(term289021, term289021.getClass(), "lastSelectEMoney", 0);
        setIntField(term289021, term289021.getClass(), "lastSelectTicket", 0);
        setIntField(term289021, term289021.getClass(), "lastSelectCourse", 0);
        setIntField(term289021, term289021.getClass(), "lastCountCourse", 0);
        setField(term289021, term289021.getClass(), "firstGameId", null);
        setField(term289021, term289021.getClass(), "firstRomVersion", null);
        setField(term289021, term289021.getClass(), "firstDataVersion", null);
        setField(term289021, term289021.getClass(), "firstPlayDate", null);
        setField(term289021, term289021.getClass(), "compatibleCmVersion", null);
        setField(term289021, term289021.getClass(), "dailyBonusDate", null);
        setField(term289021, term289021.getClass(), "dailyCourseBonusDate", null);
        setField(term289021, term289021.getClass(), "lastPairLoginDate", null);
        setField(term289021, term289021.getClass(), "lastTrialPlayDate", null);
        setIntField(term289021, term289021.getClass(), "playVsCount", 0);
        setIntField(term289021, term289021.getClass(), "playSyncCount", 0);
        setIntField(term289021, term289021.getClass(), "winCount", 0);
        setIntField(term289021, term289021.getClass(), "helpCount", 0);
        setIntField(term289021, term289021.getClass(), "comboCount", 0);
        setLongField(term289021, term289021.getClass(), "totalDeluxscore", 0L);
        setLongField(term289021, term289021.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term289021, term289021.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term289021, term289021.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term289021, term289021.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term289021, term289021.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term289021, term289021.getClass(), "totalSync", 0);
        setIntField(term289021, term289021.getClass(), "totalBasicSync", 0);
        setIntField(term289021, term289021.getClass(), "totalAdvancedSync", 0);
        setIntField(term289021, term289021.getClass(), "totalExpertSync", 0);
        setIntField(term289021, term289021.getClass(), "totalMasterSync", 0);
        setIntField(term289021, term289021.getClass(), "totalReMasterSync", 0);
        setLongField(term289021, term289021.getClass(), "totalAchievement", 0L);
        setLongField(term289021, term289021.getClass(), "totalBasicAchievement", 0L);
        setLongField(term289021, term289021.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term289021, term289021.getClass(), "totalExpertAchievement", 0L);
        setLongField(term289021, term289021.getClass(), "totalMasterAchievement", 0L);
        setLongField(term289021, term289021.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term289021, term289021.getClass(), "playerOldRating", 0L);
        setLongField(term289021, term289021.getClass(), "playerNewRating", 0L);
        setIntField(term289021, term289021.getClass(), "banState", 0);
        setLongField(term289021, term289021.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinCount", argTypes, term289021, args);
    }

};


