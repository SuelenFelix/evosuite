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

public class UserDetail_setTotalBasicSync_811795675299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293884;
     Object term293939;

    public UserDetail_setTotalBasicSync_811795675299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293884 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293884, term293884.getClass(), "id", 0L);
        setField(term293884, term293884.getClass(), "card", null);
        setField(term293884, term293884.getClass(), "userName", null);
        setIntField(term293884, term293884.getClass(), "isNetMember", 0);
        setIntField(term293884, term293884.getClass(), "iconId", 0);
        setIntField(term293884, term293884.getClass(), "plateId", 0);
        setIntField(term293884, term293884.getClass(), "titleId", 0);
        setIntField(term293884, term293884.getClass(), "partnerId", 0);
        setIntField(term293884, term293884.getClass(), "frameId", 0);
        setIntField(term293884, term293884.getClass(), "selectMapId", 0);
        setIntField(term293884, term293884.getClass(), "totalAwake", 0);
        setIntField(term293884, term293884.getClass(), "gradeRating", 0);
        setIntField(term293884, term293884.getClass(), "musicRating", 0);
        setIntField(term293884, term293884.getClass(), "playerRating", 0);
        setIntField(term293884, term293884.getClass(), "highestRating", 0);
        setIntField(term293884, term293884.getClass(), "gradeRank", 0);
        setIntField(term293884, term293884.getClass(), "classRank", 0);
        setIntField(term293884, term293884.getClass(), "courseRank", 0);
        setField(term293884, term293884.getClass(), "charaSlot", null);
        setField(term293884, term293884.getClass(), "charaLockSlot", null);
        setLongField(term293884, term293884.getClass(), "contentBit", 0L);
        setIntField(term293884, term293884.getClass(), "playCount", 0);
        setField(term293884, term293884.getClass(), "eventWatchedDate", null);
        setField(term293884, term293884.getClass(), "lastGameId", null);
        setField(term293884, term293884.getClass(), "lastRomVersion", null);
        setField(term293884, term293884.getClass(), "lastDataVersion", null);
        setField(term293884, term293884.getClass(), "lastLoginDate", null);
        setField(term293884, term293884.getClass(), "lastPlayDate", null);
        setIntField(term293884, term293884.getClass(), "lastPlayCredit", 0);
        setIntField(term293884, term293884.getClass(), "lastPlayMode", 0);
        setIntField(term293884, term293884.getClass(), "lastPlaceId", 0);
        setField(term293884, term293884.getClass(), "lastPlaceName", null);
        setIntField(term293884, term293884.getClass(), "lastAllNetId", 0);
        setIntField(term293884, term293884.getClass(), "lastRegionId", 0);
        setField(term293884, term293884.getClass(), "lastRegionName", null);
        setField(term293884, term293884.getClass(), "lastClientId", null);
        setField(term293884, term293884.getClass(), "lastCountryCode", null);
        setIntField(term293884, term293884.getClass(), "lastSelectEMoney", 0);
        setIntField(term293884, term293884.getClass(), "lastSelectTicket", 0);
        setIntField(term293884, term293884.getClass(), "lastSelectCourse", 0);
        setIntField(term293884, term293884.getClass(), "lastCountCourse", 0);
        setField(term293884, term293884.getClass(), "firstGameId", null);
        setField(term293884, term293884.getClass(), "firstRomVersion", null);
        setField(term293884, term293884.getClass(), "firstDataVersion", null);
        setField(term293884, term293884.getClass(), "firstPlayDate", null);
        setField(term293884, term293884.getClass(), "compatibleCmVersion", null);
        setField(term293884, term293884.getClass(), "dailyBonusDate", null);
        setField(term293884, term293884.getClass(), "dailyCourseBonusDate", null);
        setField(term293884, term293884.getClass(), "lastPairLoginDate", null);
        setField(term293884, term293884.getClass(), "lastTrialPlayDate", null);
        setIntField(term293884, term293884.getClass(), "playVsCount", 0);
        setIntField(term293884, term293884.getClass(), "playSyncCount", 0);
        setIntField(term293884, term293884.getClass(), "winCount", 0);
        setIntField(term293884, term293884.getClass(), "helpCount", 0);
        setIntField(term293884, term293884.getClass(), "comboCount", 0);
        setLongField(term293884, term293884.getClass(), "totalDeluxscore", 0L);
        setLongField(term293884, term293884.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293884, term293884.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293884, term293884.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293884, term293884.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293884, term293884.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293884, term293884.getClass(), "totalSync", 0);
        setIntField(term293884, term293884.getClass(), "totalBasicSync", 0);
        setIntField(term293884, term293884.getClass(), "totalAdvancedSync", 0);
        setIntField(term293884, term293884.getClass(), "totalExpertSync", 0);
        setIntField(term293884, term293884.getClass(), "totalMasterSync", 0);
        setIntField(term293884, term293884.getClass(), "totalReMasterSync", 0);
        setLongField(term293884, term293884.getClass(), "totalAchievement", 0L);
        setLongField(term293884, term293884.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293884, term293884.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293884, term293884.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293884, term293884.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293884, term293884.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293884, term293884.getClass(), "playerOldRating", 0L);
        setLongField(term293884, term293884.getClass(), "playerNewRating", 0L);
        setIntField(term293884, term293884.getClass(), "banState", 0);
        setLongField(term293884, term293884.getClass(), "dateTime", 0L);
        term293939 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293939;
        callMethod(klass, "setTotalBasicSync", argTypes, term293884, args);
    }

};


