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

public class UserDetail_setPlateId_295442221242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290677;
     Object term290732;

    public UserDetail_setPlateId_295442221242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290677, term290677.getClass(), "id", 0L);
        setField(term290677, term290677.getClass(), "card", null);
        setField(term290677, term290677.getClass(), "userName", null);
        setIntField(term290677, term290677.getClass(), "isNetMember", 0);
        setIntField(term290677, term290677.getClass(), "iconId", 0);
        setIntField(term290677, term290677.getClass(), "plateId", 0);
        setIntField(term290677, term290677.getClass(), "titleId", 0);
        setIntField(term290677, term290677.getClass(), "partnerId", 0);
        setIntField(term290677, term290677.getClass(), "frameId", 0);
        setIntField(term290677, term290677.getClass(), "selectMapId", 0);
        setIntField(term290677, term290677.getClass(), "totalAwake", 0);
        setIntField(term290677, term290677.getClass(), "gradeRating", 0);
        setIntField(term290677, term290677.getClass(), "musicRating", 0);
        setIntField(term290677, term290677.getClass(), "playerRating", 0);
        setIntField(term290677, term290677.getClass(), "highestRating", 0);
        setIntField(term290677, term290677.getClass(), "gradeRank", 0);
        setIntField(term290677, term290677.getClass(), "classRank", 0);
        setIntField(term290677, term290677.getClass(), "courseRank", 0);
        setField(term290677, term290677.getClass(), "charaSlot", null);
        setField(term290677, term290677.getClass(), "charaLockSlot", null);
        setLongField(term290677, term290677.getClass(), "contentBit", 0L);
        setIntField(term290677, term290677.getClass(), "playCount", 0);
        setField(term290677, term290677.getClass(), "eventWatchedDate", null);
        setField(term290677, term290677.getClass(), "lastGameId", null);
        setField(term290677, term290677.getClass(), "lastRomVersion", null);
        setField(term290677, term290677.getClass(), "lastDataVersion", null);
        setField(term290677, term290677.getClass(), "lastLoginDate", null);
        setField(term290677, term290677.getClass(), "lastPlayDate", null);
        setIntField(term290677, term290677.getClass(), "lastPlayCredit", 0);
        setIntField(term290677, term290677.getClass(), "lastPlayMode", 0);
        setIntField(term290677, term290677.getClass(), "lastPlaceId", 0);
        setField(term290677, term290677.getClass(), "lastPlaceName", null);
        setIntField(term290677, term290677.getClass(), "lastAllNetId", 0);
        setIntField(term290677, term290677.getClass(), "lastRegionId", 0);
        setField(term290677, term290677.getClass(), "lastRegionName", null);
        setField(term290677, term290677.getClass(), "lastClientId", null);
        setField(term290677, term290677.getClass(), "lastCountryCode", null);
        setIntField(term290677, term290677.getClass(), "lastSelectEMoney", 0);
        setIntField(term290677, term290677.getClass(), "lastSelectTicket", 0);
        setIntField(term290677, term290677.getClass(), "lastSelectCourse", 0);
        setIntField(term290677, term290677.getClass(), "lastCountCourse", 0);
        setField(term290677, term290677.getClass(), "firstGameId", null);
        setField(term290677, term290677.getClass(), "firstRomVersion", null);
        setField(term290677, term290677.getClass(), "firstDataVersion", null);
        setField(term290677, term290677.getClass(), "firstPlayDate", null);
        setField(term290677, term290677.getClass(), "compatibleCmVersion", null);
        setField(term290677, term290677.getClass(), "dailyBonusDate", null);
        setField(term290677, term290677.getClass(), "dailyCourseBonusDate", null);
        setField(term290677, term290677.getClass(), "lastPairLoginDate", null);
        setField(term290677, term290677.getClass(), "lastTrialPlayDate", null);
        setIntField(term290677, term290677.getClass(), "playVsCount", 0);
        setIntField(term290677, term290677.getClass(), "playSyncCount", 0);
        setIntField(term290677, term290677.getClass(), "winCount", 0);
        setIntField(term290677, term290677.getClass(), "helpCount", 0);
        setIntField(term290677, term290677.getClass(), "comboCount", 0);
        setLongField(term290677, term290677.getClass(), "totalDeluxscore", 0L);
        setLongField(term290677, term290677.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290677, term290677.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290677, term290677.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290677, term290677.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290677, term290677.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290677, term290677.getClass(), "totalSync", 0);
        setIntField(term290677, term290677.getClass(), "totalBasicSync", 0);
        setIntField(term290677, term290677.getClass(), "totalAdvancedSync", 0);
        setIntField(term290677, term290677.getClass(), "totalExpertSync", 0);
        setIntField(term290677, term290677.getClass(), "totalMasterSync", 0);
        setIntField(term290677, term290677.getClass(), "totalReMasterSync", 0);
        setLongField(term290677, term290677.getClass(), "totalAchievement", 0L);
        setLongField(term290677, term290677.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290677, term290677.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290677, term290677.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290677, term290677.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290677, term290677.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290677, term290677.getClass(), "playerOldRating", 0L);
        setLongField(term290677, term290677.getClass(), "playerNewRating", 0L);
        setIntField(term290677, term290677.getClass(), "banState", 0);
        setLongField(term290677, term290677.getClass(), "dateTime", 0L);
        term290732 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290732;
        callMethod(klass, "setPlateId", argTypes, term290677, args);
    }

};


