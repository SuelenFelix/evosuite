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

public class UserDetail_getCharaSlot_512912967178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287151;

    public UserDetail_getCharaSlot_512912967178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287151 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term287151, term287151.getClass(), "id", 0L);
        setField(term287151, term287151.getClass(), "card", null);
        setField(term287151, term287151.getClass(), "userName", null);
        setIntField(term287151, term287151.getClass(), "isNetMember", 0);
        setIntField(term287151, term287151.getClass(), "iconId", 0);
        setIntField(term287151, term287151.getClass(), "plateId", 0);
        setIntField(term287151, term287151.getClass(), "titleId", 0);
        setIntField(term287151, term287151.getClass(), "partnerId", 0);
        setIntField(term287151, term287151.getClass(), "frameId", 0);
        setIntField(term287151, term287151.getClass(), "selectMapId", 0);
        setIntField(term287151, term287151.getClass(), "totalAwake", 0);
        setIntField(term287151, term287151.getClass(), "gradeRating", 0);
        setIntField(term287151, term287151.getClass(), "musicRating", 0);
        setIntField(term287151, term287151.getClass(), "playerRating", 0);
        setIntField(term287151, term287151.getClass(), "highestRating", 0);
        setIntField(term287151, term287151.getClass(), "gradeRank", 0);
        setIntField(term287151, term287151.getClass(), "classRank", 0);
        setIntField(term287151, term287151.getClass(), "courseRank", 0);
        setField(term287151, term287151.getClass(), "charaSlot", null);
        setField(term287151, term287151.getClass(), "charaLockSlot", null);
        setLongField(term287151, term287151.getClass(), "contentBit", 0L);
        setIntField(term287151, term287151.getClass(), "playCount", 0);
        setField(term287151, term287151.getClass(), "eventWatchedDate", null);
        setField(term287151, term287151.getClass(), "lastGameId", null);
        setField(term287151, term287151.getClass(), "lastRomVersion", null);
        setField(term287151, term287151.getClass(), "lastDataVersion", null);
        setField(term287151, term287151.getClass(), "lastLoginDate", null);
        setField(term287151, term287151.getClass(), "lastPlayDate", null);
        setIntField(term287151, term287151.getClass(), "lastPlayCredit", 0);
        setIntField(term287151, term287151.getClass(), "lastPlayMode", 0);
        setIntField(term287151, term287151.getClass(), "lastPlaceId", 0);
        setField(term287151, term287151.getClass(), "lastPlaceName", null);
        setIntField(term287151, term287151.getClass(), "lastAllNetId", 0);
        setIntField(term287151, term287151.getClass(), "lastRegionId", 0);
        setField(term287151, term287151.getClass(), "lastRegionName", null);
        setField(term287151, term287151.getClass(), "lastClientId", null);
        setField(term287151, term287151.getClass(), "lastCountryCode", null);
        setIntField(term287151, term287151.getClass(), "lastSelectEMoney", 0);
        setIntField(term287151, term287151.getClass(), "lastSelectTicket", 0);
        setIntField(term287151, term287151.getClass(), "lastSelectCourse", 0);
        setIntField(term287151, term287151.getClass(), "lastCountCourse", 0);
        setField(term287151, term287151.getClass(), "firstGameId", null);
        setField(term287151, term287151.getClass(), "firstRomVersion", null);
        setField(term287151, term287151.getClass(), "firstDataVersion", null);
        setField(term287151, term287151.getClass(), "firstPlayDate", null);
        setField(term287151, term287151.getClass(), "compatibleCmVersion", null);
        setField(term287151, term287151.getClass(), "dailyBonusDate", null);
        setField(term287151, term287151.getClass(), "dailyCourseBonusDate", null);
        setField(term287151, term287151.getClass(), "lastPairLoginDate", null);
        setField(term287151, term287151.getClass(), "lastTrialPlayDate", null);
        setIntField(term287151, term287151.getClass(), "playVsCount", 0);
        setIntField(term287151, term287151.getClass(), "playSyncCount", 0);
        setIntField(term287151, term287151.getClass(), "winCount", 0);
        setIntField(term287151, term287151.getClass(), "helpCount", 0);
        setIntField(term287151, term287151.getClass(), "comboCount", 0);
        setLongField(term287151, term287151.getClass(), "totalDeluxscore", 0L);
        setLongField(term287151, term287151.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term287151, term287151.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term287151, term287151.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term287151, term287151.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term287151, term287151.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term287151, term287151.getClass(), "totalSync", 0);
        setIntField(term287151, term287151.getClass(), "totalBasicSync", 0);
        setIntField(term287151, term287151.getClass(), "totalAdvancedSync", 0);
        setIntField(term287151, term287151.getClass(), "totalExpertSync", 0);
        setIntField(term287151, term287151.getClass(), "totalMasterSync", 0);
        setIntField(term287151, term287151.getClass(), "totalReMasterSync", 0);
        setLongField(term287151, term287151.getClass(), "totalAchievement", 0L);
        setLongField(term287151, term287151.getClass(), "totalBasicAchievement", 0L);
        setLongField(term287151, term287151.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term287151, term287151.getClass(), "totalExpertAchievement", 0L);
        setLongField(term287151, term287151.getClass(), "totalMasterAchievement", 0L);
        setLongField(term287151, term287151.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term287151, term287151.getClass(), "playerOldRating", 0L);
        setLongField(term287151, term287151.getClass(), "playerNewRating", 0L);
        setIntField(term287151, term287151.getClass(), "banState", 0);
        setLongField(term287151, term287151.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaSlot", argTypes, term287151, args);
    }

};


