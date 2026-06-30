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

public class UserDetail_getFirstPlayDate_456950295204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288581;

    public UserDetail_getFirstPlayDate_456950295204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288581 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288581, term288581.getClass(), "id", 0L);
        setField(term288581, term288581.getClass(), "card", null);
        setField(term288581, term288581.getClass(), "userName", null);
        setIntField(term288581, term288581.getClass(), "isNetMember", 0);
        setIntField(term288581, term288581.getClass(), "iconId", 0);
        setIntField(term288581, term288581.getClass(), "plateId", 0);
        setIntField(term288581, term288581.getClass(), "titleId", 0);
        setIntField(term288581, term288581.getClass(), "partnerId", 0);
        setIntField(term288581, term288581.getClass(), "frameId", 0);
        setIntField(term288581, term288581.getClass(), "selectMapId", 0);
        setIntField(term288581, term288581.getClass(), "totalAwake", 0);
        setIntField(term288581, term288581.getClass(), "gradeRating", 0);
        setIntField(term288581, term288581.getClass(), "musicRating", 0);
        setIntField(term288581, term288581.getClass(), "playerRating", 0);
        setIntField(term288581, term288581.getClass(), "highestRating", 0);
        setIntField(term288581, term288581.getClass(), "gradeRank", 0);
        setIntField(term288581, term288581.getClass(), "classRank", 0);
        setIntField(term288581, term288581.getClass(), "courseRank", 0);
        setField(term288581, term288581.getClass(), "charaSlot", null);
        setField(term288581, term288581.getClass(), "charaLockSlot", null);
        setLongField(term288581, term288581.getClass(), "contentBit", 0L);
        setIntField(term288581, term288581.getClass(), "playCount", 0);
        setField(term288581, term288581.getClass(), "eventWatchedDate", null);
        setField(term288581, term288581.getClass(), "lastGameId", null);
        setField(term288581, term288581.getClass(), "lastRomVersion", null);
        setField(term288581, term288581.getClass(), "lastDataVersion", null);
        setField(term288581, term288581.getClass(), "lastLoginDate", null);
        setField(term288581, term288581.getClass(), "lastPlayDate", null);
        setIntField(term288581, term288581.getClass(), "lastPlayCredit", 0);
        setIntField(term288581, term288581.getClass(), "lastPlayMode", 0);
        setIntField(term288581, term288581.getClass(), "lastPlaceId", 0);
        setField(term288581, term288581.getClass(), "lastPlaceName", null);
        setIntField(term288581, term288581.getClass(), "lastAllNetId", 0);
        setIntField(term288581, term288581.getClass(), "lastRegionId", 0);
        setField(term288581, term288581.getClass(), "lastRegionName", null);
        setField(term288581, term288581.getClass(), "lastClientId", null);
        setField(term288581, term288581.getClass(), "lastCountryCode", null);
        setIntField(term288581, term288581.getClass(), "lastSelectEMoney", 0);
        setIntField(term288581, term288581.getClass(), "lastSelectTicket", 0);
        setIntField(term288581, term288581.getClass(), "lastSelectCourse", 0);
        setIntField(term288581, term288581.getClass(), "lastCountCourse", 0);
        setField(term288581, term288581.getClass(), "firstGameId", null);
        setField(term288581, term288581.getClass(), "firstRomVersion", null);
        setField(term288581, term288581.getClass(), "firstDataVersion", null);
        setField(term288581, term288581.getClass(), "firstPlayDate", null);
        setField(term288581, term288581.getClass(), "compatibleCmVersion", null);
        setField(term288581, term288581.getClass(), "dailyBonusDate", null);
        setField(term288581, term288581.getClass(), "dailyCourseBonusDate", null);
        setField(term288581, term288581.getClass(), "lastPairLoginDate", null);
        setField(term288581, term288581.getClass(), "lastTrialPlayDate", null);
        setIntField(term288581, term288581.getClass(), "playVsCount", 0);
        setIntField(term288581, term288581.getClass(), "playSyncCount", 0);
        setIntField(term288581, term288581.getClass(), "winCount", 0);
        setIntField(term288581, term288581.getClass(), "helpCount", 0);
        setIntField(term288581, term288581.getClass(), "comboCount", 0);
        setLongField(term288581, term288581.getClass(), "totalDeluxscore", 0L);
        setLongField(term288581, term288581.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288581, term288581.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288581, term288581.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288581, term288581.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288581, term288581.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288581, term288581.getClass(), "totalSync", 0);
        setIntField(term288581, term288581.getClass(), "totalBasicSync", 0);
        setIntField(term288581, term288581.getClass(), "totalAdvancedSync", 0);
        setIntField(term288581, term288581.getClass(), "totalExpertSync", 0);
        setIntField(term288581, term288581.getClass(), "totalMasterSync", 0);
        setIntField(term288581, term288581.getClass(), "totalReMasterSync", 0);
        setLongField(term288581, term288581.getClass(), "totalAchievement", 0L);
        setLongField(term288581, term288581.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288581, term288581.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288581, term288581.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288581, term288581.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288581, term288581.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288581, term288581.getClass(), "playerOldRating", 0L);
        setLongField(term288581, term288581.getClass(), "playerNewRating", 0L);
        setIntField(term288581, term288581.getClass(), "banState", 0);
        setLongField(term288581, term288581.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term288581, args);
    }

};


