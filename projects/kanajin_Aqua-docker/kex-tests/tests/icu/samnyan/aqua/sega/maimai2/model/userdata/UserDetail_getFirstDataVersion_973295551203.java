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

public class UserDetail_getFirstDataVersion_973295551203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288526;

    public UserDetail_getFirstDataVersion_973295551203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288526 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term288526, term288526.getClass(), "id", 0L);
        setField(term288526, term288526.getClass(), "card", null);
        setField(term288526, term288526.getClass(), "userName", null);
        setIntField(term288526, term288526.getClass(), "isNetMember", 0);
        setIntField(term288526, term288526.getClass(), "iconId", 0);
        setIntField(term288526, term288526.getClass(), "plateId", 0);
        setIntField(term288526, term288526.getClass(), "titleId", 0);
        setIntField(term288526, term288526.getClass(), "partnerId", 0);
        setIntField(term288526, term288526.getClass(), "frameId", 0);
        setIntField(term288526, term288526.getClass(), "selectMapId", 0);
        setIntField(term288526, term288526.getClass(), "totalAwake", 0);
        setIntField(term288526, term288526.getClass(), "gradeRating", 0);
        setIntField(term288526, term288526.getClass(), "musicRating", 0);
        setIntField(term288526, term288526.getClass(), "playerRating", 0);
        setIntField(term288526, term288526.getClass(), "highestRating", 0);
        setIntField(term288526, term288526.getClass(), "gradeRank", 0);
        setIntField(term288526, term288526.getClass(), "classRank", 0);
        setIntField(term288526, term288526.getClass(), "courseRank", 0);
        setField(term288526, term288526.getClass(), "charaSlot", null);
        setField(term288526, term288526.getClass(), "charaLockSlot", null);
        setLongField(term288526, term288526.getClass(), "contentBit", 0L);
        setIntField(term288526, term288526.getClass(), "playCount", 0);
        setField(term288526, term288526.getClass(), "eventWatchedDate", null);
        setField(term288526, term288526.getClass(), "lastGameId", null);
        setField(term288526, term288526.getClass(), "lastRomVersion", null);
        setField(term288526, term288526.getClass(), "lastDataVersion", null);
        setField(term288526, term288526.getClass(), "lastLoginDate", null);
        setField(term288526, term288526.getClass(), "lastPlayDate", null);
        setIntField(term288526, term288526.getClass(), "lastPlayCredit", 0);
        setIntField(term288526, term288526.getClass(), "lastPlayMode", 0);
        setIntField(term288526, term288526.getClass(), "lastPlaceId", 0);
        setField(term288526, term288526.getClass(), "lastPlaceName", null);
        setIntField(term288526, term288526.getClass(), "lastAllNetId", 0);
        setIntField(term288526, term288526.getClass(), "lastRegionId", 0);
        setField(term288526, term288526.getClass(), "lastRegionName", null);
        setField(term288526, term288526.getClass(), "lastClientId", null);
        setField(term288526, term288526.getClass(), "lastCountryCode", null);
        setIntField(term288526, term288526.getClass(), "lastSelectEMoney", 0);
        setIntField(term288526, term288526.getClass(), "lastSelectTicket", 0);
        setIntField(term288526, term288526.getClass(), "lastSelectCourse", 0);
        setIntField(term288526, term288526.getClass(), "lastCountCourse", 0);
        setField(term288526, term288526.getClass(), "firstGameId", null);
        setField(term288526, term288526.getClass(), "firstRomVersion", null);
        setField(term288526, term288526.getClass(), "firstDataVersion", null);
        setField(term288526, term288526.getClass(), "firstPlayDate", null);
        setField(term288526, term288526.getClass(), "compatibleCmVersion", null);
        setField(term288526, term288526.getClass(), "dailyBonusDate", null);
        setField(term288526, term288526.getClass(), "dailyCourseBonusDate", null);
        setField(term288526, term288526.getClass(), "lastPairLoginDate", null);
        setField(term288526, term288526.getClass(), "lastTrialPlayDate", null);
        setIntField(term288526, term288526.getClass(), "playVsCount", 0);
        setIntField(term288526, term288526.getClass(), "playSyncCount", 0);
        setIntField(term288526, term288526.getClass(), "winCount", 0);
        setIntField(term288526, term288526.getClass(), "helpCount", 0);
        setIntField(term288526, term288526.getClass(), "comboCount", 0);
        setLongField(term288526, term288526.getClass(), "totalDeluxscore", 0L);
        setLongField(term288526, term288526.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term288526, term288526.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term288526, term288526.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term288526, term288526.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term288526, term288526.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term288526, term288526.getClass(), "totalSync", 0);
        setIntField(term288526, term288526.getClass(), "totalBasicSync", 0);
        setIntField(term288526, term288526.getClass(), "totalAdvancedSync", 0);
        setIntField(term288526, term288526.getClass(), "totalExpertSync", 0);
        setIntField(term288526, term288526.getClass(), "totalMasterSync", 0);
        setIntField(term288526, term288526.getClass(), "totalReMasterSync", 0);
        setLongField(term288526, term288526.getClass(), "totalAchievement", 0L);
        setLongField(term288526, term288526.getClass(), "totalBasicAchievement", 0L);
        setLongField(term288526, term288526.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term288526, term288526.getClass(), "totalExpertAchievement", 0L);
        setLongField(term288526, term288526.getClass(), "totalMasterAchievement", 0L);
        setLongField(term288526, term288526.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term288526, term288526.getClass(), "playerOldRating", 0L);
        setLongField(term288526, term288526.getClass(), "playerNewRating", 0L);
        setIntField(term288526, term288526.getClass(), "banState", 0);
        setLongField(term288526, term288526.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term288526, args);
    }

};


