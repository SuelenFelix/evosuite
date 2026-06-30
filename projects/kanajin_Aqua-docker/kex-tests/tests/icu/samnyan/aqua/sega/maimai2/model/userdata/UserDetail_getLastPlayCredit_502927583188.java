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

public class UserDetail_getLastPlayCredit_502927583188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287701;

    public UserDetail_getLastPlayCredit_502927583188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287701, term287701.getClass(), "id", 0L);
        setField(term287701, term287701.getClass(), "card", null);
        setField(term287701, term287701.getClass(), "userName", null);
        setIntField(term287701, term287701.getClass(), "isNetMember", 0);
        setIntField(term287701, term287701.getClass(), "iconId", 0);
        setIntField(term287701, term287701.getClass(), "plateId", 0);
        setIntField(term287701, term287701.getClass(), "titleId", 0);
        setIntField(term287701, term287701.getClass(), "partnerId", 0);
        setIntField(term287701, term287701.getClass(), "frameId", 0);
        setIntField(term287701, term287701.getClass(), "selectMapId", 0);
        setIntField(term287701, term287701.getClass(), "totalAwake", 0);
        setIntField(term287701, term287701.getClass(), "gradeRating", 0);
        setIntField(term287701, term287701.getClass(), "musicRating", 0);
        setIntField(term287701, term287701.getClass(), "playerRating", 0);
        setIntField(term287701, term287701.getClass(), "highestRating", 0);
        setIntField(term287701, term287701.getClass(), "gradeRank", 0);
        setIntField(term287701, term287701.getClass(), "classRank", 0);
        setIntField(term287701, term287701.getClass(), "courseRank", 0);
        setField(term287701, term287701.getClass(), "charaSlot", null);
        setField(term287701, term287701.getClass(), "charaLockSlot", null);
        setLongField(term287701, term287701.getClass(), "contentBit", 0L);
        setIntField(term287701, term287701.getClass(), "playCount", 0);
        setField(term287701, term287701.getClass(), "eventWatchedDate", null);
        setField(term287701, term287701.getClass(), "lastGameId", null);
        setField(term287701, term287701.getClass(), "lastRomVersion", null);
        setField(term287701, term287701.getClass(), "lastDataVersion", null);
        setField(term287701, term287701.getClass(), "lastLoginDate", null);
        setField(term287701, term287701.getClass(), "lastPlayDate", null);
        setIntField(term287701, term287701.getClass(), "lastPlayCredit", 0);
        setIntField(term287701, term287701.getClass(), "lastPlayMode", 0);
        setIntField(term287701, term287701.getClass(), "lastPlaceId", 0);
        setField(term287701, term287701.getClass(), "lastPlaceName", null);
        setIntField(term287701, term287701.getClass(), "lastAllNetId", 0);
        setIntField(term287701, term287701.getClass(), "lastRegionId", 0);
        setField(term287701, term287701.getClass(), "lastRegionName", null);
        setField(term287701, term287701.getClass(), "lastClientId", null);
        setField(term287701, term287701.getClass(), "lastCountryCode", null);
        setIntField(term287701, term287701.getClass(), "lastSelectEMoney", 0);
        setIntField(term287701, term287701.getClass(), "lastSelectTicket", 0);
        setIntField(term287701, term287701.getClass(), "lastSelectCourse", 0);
        setIntField(term287701, term287701.getClass(), "lastCountCourse", 0);
        setField(term287701, term287701.getClass(), "firstGameId", null);
        setField(term287701, term287701.getClass(), "firstRomVersion", null);
        setField(term287701, term287701.getClass(), "firstDataVersion", null);
        setField(term287701, term287701.getClass(), "firstPlayDate", null);
        setField(term287701, term287701.getClass(), "compatibleCmVersion", null);
        setField(term287701, term287701.getClass(), "dailyBonusDate", null);
        setField(term287701, term287701.getClass(), "dailyCourseBonusDate", null);
        setField(term287701, term287701.getClass(), "lastPairLoginDate", null);
        setField(term287701, term287701.getClass(), "lastTrialPlayDate", null);
        setIntField(term287701, term287701.getClass(), "playVsCount", 0);
        setIntField(term287701, term287701.getClass(), "playSyncCount", 0);
        setIntField(term287701, term287701.getClass(), "winCount", 0);
        setIntField(term287701, term287701.getClass(), "helpCount", 0);
        setIntField(term287701, term287701.getClass(), "comboCount", 0);
        setLongField(term287701, term287701.getClass(), "totalDeluxscore", 0L);
        setLongField(term287701, term287701.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287701, term287701.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287701, term287701.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287701, term287701.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287701, term287701.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287701, term287701.getClass(), "totalSync", 0);
        setIntField(term287701, term287701.getClass(), "totalBasicSync", 0);
        setIntField(term287701, term287701.getClass(), "totalAdvancedSync", 0);
        setIntField(term287701, term287701.getClass(), "totalExpertSync", 0);
        setIntField(term287701, term287701.getClass(), "totalMasterSync", 0);
        setIntField(term287701, term287701.getClass(), "totalReMasterSync", 0);
        setLongField(term287701, term287701.getClass(), "totalAchievement", 0L);
        setLongField(term287701, term287701.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287701, term287701.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287701, term287701.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287701, term287701.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287701, term287701.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287701, term287701.getClass(), "playerOldRating", 0L);
        setLongField(term287701, term287701.getClass(), "playerNewRating", 0L);
        setIntField(term287701, term287701.getClass(), "banState", 0);
        setLongField(term287701, term287701.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayCredit", argTypes, term287701, args);
    }

};


