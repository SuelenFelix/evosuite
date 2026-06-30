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

public class UserDetail_setCard_439937545238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290453;

    public UserDetail_setCard_439937545238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290453 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290453, term290453.getClass(), "id", 0L);
        setField(term290453, term290453.getClass(), "card", null);
        setField(term290453, term290453.getClass(), "userName", null);
        setIntField(term290453, term290453.getClass(), "isNetMember", 0);
        setIntField(term290453, term290453.getClass(), "iconId", 0);
        setIntField(term290453, term290453.getClass(), "plateId", 0);
        setIntField(term290453, term290453.getClass(), "titleId", 0);
        setIntField(term290453, term290453.getClass(), "partnerId", 0);
        setIntField(term290453, term290453.getClass(), "frameId", 0);
        setIntField(term290453, term290453.getClass(), "selectMapId", 0);
        setIntField(term290453, term290453.getClass(), "totalAwake", 0);
        setIntField(term290453, term290453.getClass(), "gradeRating", 0);
        setIntField(term290453, term290453.getClass(), "musicRating", 0);
        setIntField(term290453, term290453.getClass(), "playerRating", 0);
        setIntField(term290453, term290453.getClass(), "highestRating", 0);
        setIntField(term290453, term290453.getClass(), "gradeRank", 0);
        setIntField(term290453, term290453.getClass(), "classRank", 0);
        setIntField(term290453, term290453.getClass(), "courseRank", 0);
        setField(term290453, term290453.getClass(), "charaSlot", null);
        setField(term290453, term290453.getClass(), "charaLockSlot", null);
        setLongField(term290453, term290453.getClass(), "contentBit", 0L);
        setIntField(term290453, term290453.getClass(), "playCount", 0);
        setField(term290453, term290453.getClass(), "eventWatchedDate", null);
        setField(term290453, term290453.getClass(), "lastGameId", null);
        setField(term290453, term290453.getClass(), "lastRomVersion", null);
        setField(term290453, term290453.getClass(), "lastDataVersion", null);
        setField(term290453, term290453.getClass(), "lastLoginDate", null);
        setField(term290453, term290453.getClass(), "lastPlayDate", null);
        setIntField(term290453, term290453.getClass(), "lastPlayCredit", 0);
        setIntField(term290453, term290453.getClass(), "lastPlayMode", 0);
        setIntField(term290453, term290453.getClass(), "lastPlaceId", 0);
        setField(term290453, term290453.getClass(), "lastPlaceName", null);
        setIntField(term290453, term290453.getClass(), "lastAllNetId", 0);
        setIntField(term290453, term290453.getClass(), "lastRegionId", 0);
        setField(term290453, term290453.getClass(), "lastRegionName", null);
        setField(term290453, term290453.getClass(), "lastClientId", null);
        setField(term290453, term290453.getClass(), "lastCountryCode", null);
        setIntField(term290453, term290453.getClass(), "lastSelectEMoney", 0);
        setIntField(term290453, term290453.getClass(), "lastSelectTicket", 0);
        setIntField(term290453, term290453.getClass(), "lastSelectCourse", 0);
        setIntField(term290453, term290453.getClass(), "lastCountCourse", 0);
        setField(term290453, term290453.getClass(), "firstGameId", null);
        setField(term290453, term290453.getClass(), "firstRomVersion", null);
        setField(term290453, term290453.getClass(), "firstDataVersion", null);
        setField(term290453, term290453.getClass(), "firstPlayDate", null);
        setField(term290453, term290453.getClass(), "compatibleCmVersion", null);
        setField(term290453, term290453.getClass(), "dailyBonusDate", null);
        setField(term290453, term290453.getClass(), "dailyCourseBonusDate", null);
        setField(term290453, term290453.getClass(), "lastPairLoginDate", null);
        setField(term290453, term290453.getClass(), "lastTrialPlayDate", null);
        setIntField(term290453, term290453.getClass(), "playVsCount", 0);
        setIntField(term290453, term290453.getClass(), "playSyncCount", 0);
        setIntField(term290453, term290453.getClass(), "winCount", 0);
        setIntField(term290453, term290453.getClass(), "helpCount", 0);
        setIntField(term290453, term290453.getClass(), "comboCount", 0);
        setLongField(term290453, term290453.getClass(), "totalDeluxscore", 0L);
        setLongField(term290453, term290453.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290453, term290453.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290453, term290453.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290453, term290453.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290453, term290453.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290453, term290453.getClass(), "totalSync", 0);
        setIntField(term290453, term290453.getClass(), "totalBasicSync", 0);
        setIntField(term290453, term290453.getClass(), "totalAdvancedSync", 0);
        setIntField(term290453, term290453.getClass(), "totalExpertSync", 0);
        setIntField(term290453, term290453.getClass(), "totalMasterSync", 0);
        setIntField(term290453, term290453.getClass(), "totalReMasterSync", 0);
        setLongField(term290453, term290453.getClass(), "totalAchievement", 0L);
        setLongField(term290453, term290453.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290453, term290453.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290453, term290453.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290453, term290453.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290453, term290453.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290453, term290453.getClass(), "playerOldRating", 0L);
        setLongField(term290453, term290453.getClass(), "playerNewRating", 0L);
        setIntField(term290453, term290453.getClass(), "banState", 0);
        setLongField(term290453, term290453.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCard", argTypes, term290453, args);
    }

};


