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
import java.lang.Integer;

public class UserDetail_setPlaySyncCount_538431612288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293257;
     Object term293312;

    public UserDetail_setPlaySyncCount_538431612288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293257 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293257, term293257.getClass(), "id", 0L);
        setField(term293257, term293257.getClass(), "card", null);
        setField(term293257, term293257.getClass(), "userName", null);
        setIntField(term293257, term293257.getClass(), "isNetMember", 0);
        setIntField(term293257, term293257.getClass(), "iconId", 0);
        setIntField(term293257, term293257.getClass(), "plateId", 0);
        setIntField(term293257, term293257.getClass(), "titleId", 0);
        setIntField(term293257, term293257.getClass(), "partnerId", 0);
        setIntField(term293257, term293257.getClass(), "frameId", 0);
        setIntField(term293257, term293257.getClass(), "selectMapId", 0);
        setIntField(term293257, term293257.getClass(), "totalAwake", 0);
        setIntField(term293257, term293257.getClass(), "gradeRating", 0);
        setIntField(term293257, term293257.getClass(), "musicRating", 0);
        setIntField(term293257, term293257.getClass(), "playerRating", 0);
        setIntField(term293257, term293257.getClass(), "highestRating", 0);
        setIntField(term293257, term293257.getClass(), "gradeRank", 0);
        setIntField(term293257, term293257.getClass(), "classRank", 0);
        setIntField(term293257, term293257.getClass(), "courseRank", 0);
        setField(term293257, term293257.getClass(), "charaSlot", null);
        setField(term293257, term293257.getClass(), "charaLockSlot", null);
        setLongField(term293257, term293257.getClass(), "contentBit", 0L);
        setIntField(term293257, term293257.getClass(), "playCount", 0);
        setField(term293257, term293257.getClass(), "eventWatchedDate", null);
        setField(term293257, term293257.getClass(), "lastGameId", null);
        setField(term293257, term293257.getClass(), "lastRomVersion", null);
        setField(term293257, term293257.getClass(), "lastDataVersion", null);
        setField(term293257, term293257.getClass(), "lastLoginDate", null);
        setField(term293257, term293257.getClass(), "lastPlayDate", null);
        setIntField(term293257, term293257.getClass(), "lastPlayCredit", 0);
        setIntField(term293257, term293257.getClass(), "lastPlayMode", 0);
        setIntField(term293257, term293257.getClass(), "lastPlaceId", 0);
        setField(term293257, term293257.getClass(), "lastPlaceName", null);
        setIntField(term293257, term293257.getClass(), "lastAllNetId", 0);
        setIntField(term293257, term293257.getClass(), "lastRegionId", 0);
        setField(term293257, term293257.getClass(), "lastRegionName", null);
        setField(term293257, term293257.getClass(), "lastClientId", null);
        setField(term293257, term293257.getClass(), "lastCountryCode", null);
        setIntField(term293257, term293257.getClass(), "lastSelectEMoney", 0);
        setIntField(term293257, term293257.getClass(), "lastSelectTicket", 0);
        setIntField(term293257, term293257.getClass(), "lastSelectCourse", 0);
        setIntField(term293257, term293257.getClass(), "lastCountCourse", 0);
        setField(term293257, term293257.getClass(), "firstGameId", null);
        setField(term293257, term293257.getClass(), "firstRomVersion", null);
        setField(term293257, term293257.getClass(), "firstDataVersion", null);
        setField(term293257, term293257.getClass(), "firstPlayDate", null);
        setField(term293257, term293257.getClass(), "compatibleCmVersion", null);
        setField(term293257, term293257.getClass(), "dailyBonusDate", null);
        setField(term293257, term293257.getClass(), "dailyCourseBonusDate", null);
        setField(term293257, term293257.getClass(), "lastPairLoginDate", null);
        setField(term293257, term293257.getClass(), "lastTrialPlayDate", null);
        setIntField(term293257, term293257.getClass(), "playVsCount", 0);
        setIntField(term293257, term293257.getClass(), "playSyncCount", 0);
        setIntField(term293257, term293257.getClass(), "winCount", 0);
        setIntField(term293257, term293257.getClass(), "helpCount", 0);
        setIntField(term293257, term293257.getClass(), "comboCount", 0);
        setLongField(term293257, term293257.getClass(), "totalDeluxscore", 0L);
        setLongField(term293257, term293257.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293257, term293257.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293257, term293257.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293257, term293257.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293257, term293257.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293257, term293257.getClass(), "totalSync", 0);
        setIntField(term293257, term293257.getClass(), "totalBasicSync", 0);
        setIntField(term293257, term293257.getClass(), "totalAdvancedSync", 0);
        setIntField(term293257, term293257.getClass(), "totalExpertSync", 0);
        setIntField(term293257, term293257.getClass(), "totalMasterSync", 0);
        setIntField(term293257, term293257.getClass(), "totalReMasterSync", 0);
        setLongField(term293257, term293257.getClass(), "totalAchievement", 0L);
        setLongField(term293257, term293257.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293257, term293257.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293257, term293257.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293257, term293257.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293257, term293257.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293257, term293257.getClass(), "playerOldRating", 0L);
        setLongField(term293257, term293257.getClass(), "playerNewRating", 0L);
        setIntField(term293257, term293257.getClass(), "banState", 0);
        setLongField(term293257, term293257.getClass(), "dateTime", 0L);
        term293312 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293312;
        callMethod(klass, "setPlaySyncCount", argTypes, term293257, args);
    }

};


