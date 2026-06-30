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

public class UserDetail_setTitleId_175762799243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290734;
     Object term290789;

    public UserDetail_setTitleId_175762799243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290734 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290734, term290734.getClass(), "id", 0L);
        setField(term290734, term290734.getClass(), "card", null);
        setField(term290734, term290734.getClass(), "userName", null);
        setIntField(term290734, term290734.getClass(), "isNetMember", 0);
        setIntField(term290734, term290734.getClass(), "iconId", 0);
        setIntField(term290734, term290734.getClass(), "plateId", 0);
        setIntField(term290734, term290734.getClass(), "titleId", 0);
        setIntField(term290734, term290734.getClass(), "partnerId", 0);
        setIntField(term290734, term290734.getClass(), "frameId", 0);
        setIntField(term290734, term290734.getClass(), "selectMapId", 0);
        setIntField(term290734, term290734.getClass(), "totalAwake", 0);
        setIntField(term290734, term290734.getClass(), "gradeRating", 0);
        setIntField(term290734, term290734.getClass(), "musicRating", 0);
        setIntField(term290734, term290734.getClass(), "playerRating", 0);
        setIntField(term290734, term290734.getClass(), "highestRating", 0);
        setIntField(term290734, term290734.getClass(), "gradeRank", 0);
        setIntField(term290734, term290734.getClass(), "classRank", 0);
        setIntField(term290734, term290734.getClass(), "courseRank", 0);
        setField(term290734, term290734.getClass(), "charaSlot", null);
        setField(term290734, term290734.getClass(), "charaLockSlot", null);
        setLongField(term290734, term290734.getClass(), "contentBit", 0L);
        setIntField(term290734, term290734.getClass(), "playCount", 0);
        setField(term290734, term290734.getClass(), "eventWatchedDate", null);
        setField(term290734, term290734.getClass(), "lastGameId", null);
        setField(term290734, term290734.getClass(), "lastRomVersion", null);
        setField(term290734, term290734.getClass(), "lastDataVersion", null);
        setField(term290734, term290734.getClass(), "lastLoginDate", null);
        setField(term290734, term290734.getClass(), "lastPlayDate", null);
        setIntField(term290734, term290734.getClass(), "lastPlayCredit", 0);
        setIntField(term290734, term290734.getClass(), "lastPlayMode", 0);
        setIntField(term290734, term290734.getClass(), "lastPlaceId", 0);
        setField(term290734, term290734.getClass(), "lastPlaceName", null);
        setIntField(term290734, term290734.getClass(), "lastAllNetId", 0);
        setIntField(term290734, term290734.getClass(), "lastRegionId", 0);
        setField(term290734, term290734.getClass(), "lastRegionName", null);
        setField(term290734, term290734.getClass(), "lastClientId", null);
        setField(term290734, term290734.getClass(), "lastCountryCode", null);
        setIntField(term290734, term290734.getClass(), "lastSelectEMoney", 0);
        setIntField(term290734, term290734.getClass(), "lastSelectTicket", 0);
        setIntField(term290734, term290734.getClass(), "lastSelectCourse", 0);
        setIntField(term290734, term290734.getClass(), "lastCountCourse", 0);
        setField(term290734, term290734.getClass(), "firstGameId", null);
        setField(term290734, term290734.getClass(), "firstRomVersion", null);
        setField(term290734, term290734.getClass(), "firstDataVersion", null);
        setField(term290734, term290734.getClass(), "firstPlayDate", null);
        setField(term290734, term290734.getClass(), "compatibleCmVersion", null);
        setField(term290734, term290734.getClass(), "dailyBonusDate", null);
        setField(term290734, term290734.getClass(), "dailyCourseBonusDate", null);
        setField(term290734, term290734.getClass(), "lastPairLoginDate", null);
        setField(term290734, term290734.getClass(), "lastTrialPlayDate", null);
        setIntField(term290734, term290734.getClass(), "playVsCount", 0);
        setIntField(term290734, term290734.getClass(), "playSyncCount", 0);
        setIntField(term290734, term290734.getClass(), "winCount", 0);
        setIntField(term290734, term290734.getClass(), "helpCount", 0);
        setIntField(term290734, term290734.getClass(), "comboCount", 0);
        setLongField(term290734, term290734.getClass(), "totalDeluxscore", 0L);
        setLongField(term290734, term290734.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290734, term290734.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290734, term290734.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290734, term290734.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290734, term290734.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290734, term290734.getClass(), "totalSync", 0);
        setIntField(term290734, term290734.getClass(), "totalBasicSync", 0);
        setIntField(term290734, term290734.getClass(), "totalAdvancedSync", 0);
        setIntField(term290734, term290734.getClass(), "totalExpertSync", 0);
        setIntField(term290734, term290734.getClass(), "totalMasterSync", 0);
        setIntField(term290734, term290734.getClass(), "totalReMasterSync", 0);
        setLongField(term290734, term290734.getClass(), "totalAchievement", 0L);
        setLongField(term290734, term290734.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290734, term290734.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290734, term290734.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290734, term290734.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290734, term290734.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290734, term290734.getClass(), "playerOldRating", 0L);
        setLongField(term290734, term290734.getClass(), "playerNewRating", 0L);
        setIntField(term290734, term290734.getClass(), "banState", 0);
        setLongField(term290734, term290734.getClass(), "dateTime", 0L);
        term290789 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290789;
        callMethod(klass, "setTitleId", argTypes, term290734, args);
    }

};


