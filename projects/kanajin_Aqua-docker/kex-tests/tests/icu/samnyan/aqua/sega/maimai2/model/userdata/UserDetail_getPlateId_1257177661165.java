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

public class UserDetail_getPlateId_1257177661165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286436;

    public UserDetail_getPlateId_1257177661165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286436 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term286436, term286436.getClass(), "id", 0L);
        setField(term286436, term286436.getClass(), "card", null);
        setField(term286436, term286436.getClass(), "userName", null);
        setIntField(term286436, term286436.getClass(), "isNetMember", 0);
        setIntField(term286436, term286436.getClass(), "iconId", 0);
        setIntField(term286436, term286436.getClass(), "plateId", 0);
        setIntField(term286436, term286436.getClass(), "titleId", 0);
        setIntField(term286436, term286436.getClass(), "partnerId", 0);
        setIntField(term286436, term286436.getClass(), "frameId", 0);
        setIntField(term286436, term286436.getClass(), "selectMapId", 0);
        setIntField(term286436, term286436.getClass(), "totalAwake", 0);
        setIntField(term286436, term286436.getClass(), "gradeRating", 0);
        setIntField(term286436, term286436.getClass(), "musicRating", 0);
        setIntField(term286436, term286436.getClass(), "playerRating", 0);
        setIntField(term286436, term286436.getClass(), "highestRating", 0);
        setIntField(term286436, term286436.getClass(), "gradeRank", 0);
        setIntField(term286436, term286436.getClass(), "classRank", 0);
        setIntField(term286436, term286436.getClass(), "courseRank", 0);
        setField(term286436, term286436.getClass(), "charaSlot", null);
        setField(term286436, term286436.getClass(), "charaLockSlot", null);
        setLongField(term286436, term286436.getClass(), "contentBit", 0L);
        setIntField(term286436, term286436.getClass(), "playCount", 0);
        setField(term286436, term286436.getClass(), "eventWatchedDate", null);
        setField(term286436, term286436.getClass(), "lastGameId", null);
        setField(term286436, term286436.getClass(), "lastRomVersion", null);
        setField(term286436, term286436.getClass(), "lastDataVersion", null);
        setField(term286436, term286436.getClass(), "lastLoginDate", null);
        setField(term286436, term286436.getClass(), "lastPlayDate", null);
        setIntField(term286436, term286436.getClass(), "lastPlayCredit", 0);
        setIntField(term286436, term286436.getClass(), "lastPlayMode", 0);
        setIntField(term286436, term286436.getClass(), "lastPlaceId", 0);
        setField(term286436, term286436.getClass(), "lastPlaceName", null);
        setIntField(term286436, term286436.getClass(), "lastAllNetId", 0);
        setIntField(term286436, term286436.getClass(), "lastRegionId", 0);
        setField(term286436, term286436.getClass(), "lastRegionName", null);
        setField(term286436, term286436.getClass(), "lastClientId", null);
        setField(term286436, term286436.getClass(), "lastCountryCode", null);
        setIntField(term286436, term286436.getClass(), "lastSelectEMoney", 0);
        setIntField(term286436, term286436.getClass(), "lastSelectTicket", 0);
        setIntField(term286436, term286436.getClass(), "lastSelectCourse", 0);
        setIntField(term286436, term286436.getClass(), "lastCountCourse", 0);
        setField(term286436, term286436.getClass(), "firstGameId", null);
        setField(term286436, term286436.getClass(), "firstRomVersion", null);
        setField(term286436, term286436.getClass(), "firstDataVersion", null);
        setField(term286436, term286436.getClass(), "firstPlayDate", null);
        setField(term286436, term286436.getClass(), "compatibleCmVersion", null);
        setField(term286436, term286436.getClass(), "dailyBonusDate", null);
        setField(term286436, term286436.getClass(), "dailyCourseBonusDate", null);
        setField(term286436, term286436.getClass(), "lastPairLoginDate", null);
        setField(term286436, term286436.getClass(), "lastTrialPlayDate", null);
        setIntField(term286436, term286436.getClass(), "playVsCount", 0);
        setIntField(term286436, term286436.getClass(), "playSyncCount", 0);
        setIntField(term286436, term286436.getClass(), "winCount", 0);
        setIntField(term286436, term286436.getClass(), "helpCount", 0);
        setIntField(term286436, term286436.getClass(), "comboCount", 0);
        setLongField(term286436, term286436.getClass(), "totalDeluxscore", 0L);
        setLongField(term286436, term286436.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term286436, term286436.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term286436, term286436.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term286436, term286436.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term286436, term286436.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term286436, term286436.getClass(), "totalSync", 0);
        setIntField(term286436, term286436.getClass(), "totalBasicSync", 0);
        setIntField(term286436, term286436.getClass(), "totalAdvancedSync", 0);
        setIntField(term286436, term286436.getClass(), "totalExpertSync", 0);
        setIntField(term286436, term286436.getClass(), "totalMasterSync", 0);
        setIntField(term286436, term286436.getClass(), "totalReMasterSync", 0);
        setLongField(term286436, term286436.getClass(), "totalAchievement", 0L);
        setLongField(term286436, term286436.getClass(), "totalBasicAchievement", 0L);
        setLongField(term286436, term286436.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term286436, term286436.getClass(), "totalExpertAchievement", 0L);
        setLongField(term286436, term286436.getClass(), "totalMasterAchievement", 0L);
        setLongField(term286436, term286436.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term286436, term286436.getClass(), "playerOldRating", 0L);
        setLongField(term286436, term286436.getClass(), "playerNewRating", 0L);
        setIntField(term286436, term286436.getClass(), "banState", 0);
        setLongField(term286436, term286436.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlateId", argTypes, term286436, args);
    }

};


