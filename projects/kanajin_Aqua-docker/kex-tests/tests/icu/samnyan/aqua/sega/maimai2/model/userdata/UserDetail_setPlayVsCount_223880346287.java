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

public class UserDetail_setPlayVsCount_223880346287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293200;
     Object term293255;

    public UserDetail_setPlayVsCount_223880346287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293200 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293200, term293200.getClass(), "id", 0L);
        setField(term293200, term293200.getClass(), "card", null);
        setField(term293200, term293200.getClass(), "userName", null);
        setIntField(term293200, term293200.getClass(), "isNetMember", 0);
        setIntField(term293200, term293200.getClass(), "iconId", 0);
        setIntField(term293200, term293200.getClass(), "plateId", 0);
        setIntField(term293200, term293200.getClass(), "titleId", 0);
        setIntField(term293200, term293200.getClass(), "partnerId", 0);
        setIntField(term293200, term293200.getClass(), "frameId", 0);
        setIntField(term293200, term293200.getClass(), "selectMapId", 0);
        setIntField(term293200, term293200.getClass(), "totalAwake", 0);
        setIntField(term293200, term293200.getClass(), "gradeRating", 0);
        setIntField(term293200, term293200.getClass(), "musicRating", 0);
        setIntField(term293200, term293200.getClass(), "playerRating", 0);
        setIntField(term293200, term293200.getClass(), "highestRating", 0);
        setIntField(term293200, term293200.getClass(), "gradeRank", 0);
        setIntField(term293200, term293200.getClass(), "classRank", 0);
        setIntField(term293200, term293200.getClass(), "courseRank", 0);
        setField(term293200, term293200.getClass(), "charaSlot", null);
        setField(term293200, term293200.getClass(), "charaLockSlot", null);
        setLongField(term293200, term293200.getClass(), "contentBit", 0L);
        setIntField(term293200, term293200.getClass(), "playCount", 0);
        setField(term293200, term293200.getClass(), "eventWatchedDate", null);
        setField(term293200, term293200.getClass(), "lastGameId", null);
        setField(term293200, term293200.getClass(), "lastRomVersion", null);
        setField(term293200, term293200.getClass(), "lastDataVersion", null);
        setField(term293200, term293200.getClass(), "lastLoginDate", null);
        setField(term293200, term293200.getClass(), "lastPlayDate", null);
        setIntField(term293200, term293200.getClass(), "lastPlayCredit", 0);
        setIntField(term293200, term293200.getClass(), "lastPlayMode", 0);
        setIntField(term293200, term293200.getClass(), "lastPlaceId", 0);
        setField(term293200, term293200.getClass(), "lastPlaceName", null);
        setIntField(term293200, term293200.getClass(), "lastAllNetId", 0);
        setIntField(term293200, term293200.getClass(), "lastRegionId", 0);
        setField(term293200, term293200.getClass(), "lastRegionName", null);
        setField(term293200, term293200.getClass(), "lastClientId", null);
        setField(term293200, term293200.getClass(), "lastCountryCode", null);
        setIntField(term293200, term293200.getClass(), "lastSelectEMoney", 0);
        setIntField(term293200, term293200.getClass(), "lastSelectTicket", 0);
        setIntField(term293200, term293200.getClass(), "lastSelectCourse", 0);
        setIntField(term293200, term293200.getClass(), "lastCountCourse", 0);
        setField(term293200, term293200.getClass(), "firstGameId", null);
        setField(term293200, term293200.getClass(), "firstRomVersion", null);
        setField(term293200, term293200.getClass(), "firstDataVersion", null);
        setField(term293200, term293200.getClass(), "firstPlayDate", null);
        setField(term293200, term293200.getClass(), "compatibleCmVersion", null);
        setField(term293200, term293200.getClass(), "dailyBonusDate", null);
        setField(term293200, term293200.getClass(), "dailyCourseBonusDate", null);
        setField(term293200, term293200.getClass(), "lastPairLoginDate", null);
        setField(term293200, term293200.getClass(), "lastTrialPlayDate", null);
        setIntField(term293200, term293200.getClass(), "playVsCount", 0);
        setIntField(term293200, term293200.getClass(), "playSyncCount", 0);
        setIntField(term293200, term293200.getClass(), "winCount", 0);
        setIntField(term293200, term293200.getClass(), "helpCount", 0);
        setIntField(term293200, term293200.getClass(), "comboCount", 0);
        setLongField(term293200, term293200.getClass(), "totalDeluxscore", 0L);
        setLongField(term293200, term293200.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293200, term293200.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293200, term293200.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293200, term293200.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293200, term293200.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293200, term293200.getClass(), "totalSync", 0);
        setIntField(term293200, term293200.getClass(), "totalBasicSync", 0);
        setIntField(term293200, term293200.getClass(), "totalAdvancedSync", 0);
        setIntField(term293200, term293200.getClass(), "totalExpertSync", 0);
        setIntField(term293200, term293200.getClass(), "totalMasterSync", 0);
        setIntField(term293200, term293200.getClass(), "totalReMasterSync", 0);
        setLongField(term293200, term293200.getClass(), "totalAchievement", 0L);
        setLongField(term293200, term293200.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293200, term293200.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293200, term293200.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293200, term293200.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293200, term293200.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293200, term293200.getClass(), "playerOldRating", 0L);
        setLongField(term293200, term293200.getClass(), "playerNewRating", 0L);
        setIntField(term293200, term293200.getClass(), "banState", 0);
        setLongField(term293200, term293200.getClass(), "dateTime", 0L);
        term293255 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293255;
        callMethod(klass, "setPlayVsCount", argTypes, term293200, args);
    }

};


