package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserPlaylog_setHoldGreat_849996131105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988807;
     Object term3989119;

    public UserPlaylog_setHoldGreat_849996131105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3988813 = new Long(5959106241680890675L);
        term3988807 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3988809 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3988811 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3988827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3988828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3988832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3988837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3988838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3988842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3988807, term3988807.getClass(), "id", 2853599232283064636L);
        setLongField(term3988809, term3988809.getClass(), "id", 8655266478942637481L);
        setLongField(term3988811, term3988811.getClass(), "id", -6645428539177838819L);
        setField(term3988811, term3988811.getClass(), "extId", term3988813);
        setField(term3988811, term3988811.getClass(), "luid", "oHpLdOCcHc");
        setIntField(term3988828, term3988828.getClass(), "year", 2014);
        setShortField(term3988828, term3988828.getClass(), "month", (short) 2);
        setShortField(term3988828, term3988828.getClass(), "day", (short) 7);
        setField(term3988827, term3988827.getClass(), "date", term3988828);
        setByteField(term3988832, term3988832.getClass(), "hour", (byte) 12);
        setByteField(term3988832, term3988832.getClass(), "minute", (byte) 39);
        setByteField(term3988832, term3988832.getClass(), "second", (byte) 8);
        setIntField(term3988832, term3988832.getClass(), "nano", 170670194);
        setField(term3988827, term3988827.getClass(), "time", term3988832);
        setField(term3988811, term3988811.getClass(), "registerTime", term3988827);
        setIntField(term3988838, term3988838.getClass(), "year", 2010);
        setShortField(term3988838, term3988838.getClass(), "month", (short) 1);
        setShortField(term3988838, term3988838.getClass(), "day", (short) 31);
        setField(term3988837, term3988837.getClass(), "date", term3988838);
        setByteField(term3988842, term3988842.getClass(), "hour", (byte) 17);
        setByteField(term3988842, term3988842.getClass(), "minute", (byte) 53);
        setByteField(term3988842, term3988842.getClass(), "second", (byte) 40);
        setIntField(term3988842, term3988842.getClass(), "nano", 987932150);
        setField(term3988837, term3988837.getClass(), "time", term3988842);
        setField(term3988811, term3988811.getClass(), "accessTime", term3988837);
        setField(term3988809, term3988809.getClass(), "card", term3988811);
        setIntField(term3988809, term3988809.getClass(), "lastDataVersion", -958260032);
        setField(term3988809, term3988809.getClass(), "userName", "SwzGOReYSK");
        setIntField(term3988809, term3988809.getClass(), "point", -494650967);
        setIntField(term3988809, term3988809.getClass(), "totalPoint", -96506371);
        setIntField(term3988809, term3988809.getClass(), "iconId", -134301721);
        setIntField(term3988809, term3988809.getClass(), "nameplateId", 1582391359);
        setIntField(term3988809, term3988809.getClass(), "frameId", -1037697749);
        setIntField(term3988809, term3988809.getClass(), "trophyId", -738368841);
        setIntField(term3988809, term3988809.getClass(), "playCount", 732025993);
        setIntField(term3988809, term3988809.getClass(), "playVsCount", -784491429);
        setIntField(term3988809, term3988809.getClass(), "playSyncCount", 270090658);
        setIntField(term3988809, term3988809.getClass(), "winCount", -1397169311);
        setIntField(term3988809, term3988809.getClass(), "helpCount", 618692272);
        setIntField(term3988809, term3988809.getClass(), "comboCount", 1770904047);
        setIntField(term3988809, term3988809.getClass(), "feverCount", -1524718708);
        setIntField(term3988809, term3988809.getClass(), "totalHiScore", -227757354);
        setIntField(term3988809, term3988809.getClass(), "totalEasyHighScore", 1208046800);
        setIntField(term3988809, term3988809.getClass(), "totalBasicHighScore", -1805381037);
        setIntField(term3988809, term3988809.getClass(), "totalAdvancedHighScore", 1667437192);
        setIntField(term3988809, term3988809.getClass(), "totalExpertHighScore", 1109193261);
        setIntField(term3988809, term3988809.getClass(), "totalMasterHighScore", -351252462);
        setIntField(term3988809, term3988809.getClass(), "totalReMasterHighScore", 1721775530);
        setIntField(term3988809, term3988809.getClass(), "totalHighSync", 124320536);
        setIntField(term3988809, term3988809.getClass(), "totalEasySync", 1330905387);
        setIntField(term3988809, term3988809.getClass(), "totalBasicSync", -1700622909);
        setIntField(term3988809, term3988809.getClass(), "totalAdvancedSync", 727499383);
        setIntField(term3988809, term3988809.getClass(), "totalExpertSync", -676083545);
        setIntField(term3988809, term3988809.getClass(), "totalMasterSync", 447246840);
        setIntField(term3988809, term3988809.getClass(), "totalReMasterSync", 1807928047);
        setIntField(term3988809, term3988809.getClass(), "playerRating", -270220682);
        setIntField(term3988809, term3988809.getClass(), "highestRating", 689636302);
        setIntField(term3988809, term3988809.getClass(), "rankAuthTailId", -721288170);
        setField(term3988809, term3988809.getClass(), "eventWatchedDate", "dDDNoRGgPC");
        setField(term3988809, term3988809.getClass(), "webLimitDate", "QQZjNOmqCE");
        setIntField(term3988809, term3988809.getClass(), "challengeTrackPhase", -1430817207);
        setIntField(term3988809, term3988809.getClass(), "firstPlayBits", 407650473);
        setField(term3988809, term3988809.getClass(), "lastPlayDate", "gOekuXghmq");
        setIntField(term3988809, term3988809.getClass(), "lastPlaceId", -801468206);
        setField(term3988809, term3988809.getClass(), "lastPlaceName", "zLduTZSZtZ");
        setIntField(term3988809, term3988809.getClass(), "lastRegionId", 507435662);
        setField(term3988809, term3988809.getClass(), "lastRegionName", "AadEEQQKqQ");
        setField(term3988809, term3988809.getClass(), "lastClientId", "CwgGpZyCZy");
        setField(term3988809, term3988809.getClass(), "lastCountryCode", "tbXmUgtHYp");
        setIntField(term3988809, term3988809.getClass(), "eventPoint", 100498509);
        setIntField(term3988809, term3988809.getClass(), "totalLv", 1758563504);
        setIntField(term3988809, term3988809.getClass(), "lastLoginBonusDay", 1808388721);
        setIntField(term3988809, term3988809.getClass(), "lastSurvivalBonusDay", -96902805);
        setIntField(term3988809, term3988809.getClass(), "loginBonusLv", 1289826728);
        setField(term3988807, term3988807.getClass(), "user", term3988809);
        setIntField(term3988807, term3988807.getClass(), "orderId", 1539235677);
        setLongField(term3988807, term3988807.getClass(), "sortNumber", -1354091529922970775L);
        setIntField(term3988807, term3988807.getClass(), "placeId", -1074023203);
        setField(term3988807, term3988807.getClass(), "placeName", "NiAJGsJGMV");
        setField(term3988807, term3988807.getClass(), "country", "rPStizbOnv");
        setIntField(term3988807, term3988807.getClass(), "regionId", -1572694420);
        setField(term3988807, term3988807.getClass(), "playDate", "mtkaMSgxdn");
        setField(term3988807, term3988807.getClass(), "userPlayDate", "HMamTAyCXD");
        setIntField(term3988807, term3988807.getClass(), "musicId", -1680801833);
        setIntField(term3988807, term3988807.getClass(), "level", -1494666105);
        setIntField(term3988807, term3988807.getClass(), "gameMode", 749069576);
        setIntField(term3988807, term3988807.getClass(), "rivalNum", -97801996);
        setIntField(term3988807, term3988807.getClass(), "track", -467945459);
        setIntField(term3988807, term3988807.getClass(), "eventId", 677539358);
        setBooleanField(term3988807, term3988807.getClass(), "isFreeToPlay", true);
        setIntField(term3988807, term3988807.getClass(), "playerRating", 789428258);
        setLongField(term3988807, term3988807.getClass(), "playedUserId1", 4103427193877871002L);
        setField(term3988807, term3988807.getClass(), "playedUserName1", "qLljnCSGMB");
        setIntField(term3988807, term3988807.getClass(), "playedMusicLevel1", -768268987);
        setLongField(term3988807, term3988807.getClass(), "playedUserId2", 6399408669304337066L);
        setField(term3988807, term3988807.getClass(), "playedUserName2", "RWGJbzBNft");
        setIntField(term3988807, term3988807.getClass(), "playedMusicLevel2", -880365479);
        setLongField(term3988807, term3988807.getClass(), "playedUserId3", 3845022267838505403L);
        setField(term3988807, term3988807.getClass(), "playedUserName3", "TyLngohohc");
        setIntField(term3988807, term3988807.getClass(), "playedMusicLevel3", 214045824);
        setIntField(term3988807, term3988807.getClass(), "achievement", 824018783);
        setIntField(term3988807, term3988807.getClass(), "score", -1578557715);
        setIntField(term3988807, term3988807.getClass(), "tapScore", -129626360);
        setIntField(term3988807, term3988807.getClass(), "holdScore", 1942571018);
        setIntField(term3988807, term3988807.getClass(), "slideScore", -89291779);
        setIntField(term3988807, term3988807.getClass(), "breakScore", 508104319);
        setIntField(term3988807, term3988807.getClass(), "syncRate", -1314658233);
        setIntField(term3988807, term3988807.getClass(), "vsWin", -2024032272);
        setBooleanField(term3988807, term3988807.getClass(), "isAllPerfect", true);
        setIntField(term3988807, term3988807.getClass(), "fullCombo", -1967700091);
        setIntField(term3988807, term3988807.getClass(), "maxFever", -15772026);
        setIntField(term3988807, term3988807.getClass(), "maxCombo", -481750515);
        setIntField(term3988807, term3988807.getClass(), "tapPerfect", 1578152529);
        setIntField(term3988807, term3988807.getClass(), "tapGreat", 234595408);
        setIntField(term3988807, term3988807.getClass(), "tapGood", -1370512457);
        setIntField(term3988807, term3988807.getClass(), "tapBad", -1025191369);
        setIntField(term3988807, term3988807.getClass(), "holdPerfect", -348348027);
        setIntField(term3988807, term3988807.getClass(), "holdGreat", -82412980);
        setIntField(term3988807, term3988807.getClass(), "holdGood", 717266021);
        setIntField(term3988807, term3988807.getClass(), "holdBad", -1273050381);
        setIntField(term3988807, term3988807.getClass(), "slidePerfect", 193235641);
        setIntField(term3988807, term3988807.getClass(), "slideGreat", -109800448);
        setIntField(term3988807, term3988807.getClass(), "slideGood", 2058130233);
        setIntField(term3988807, term3988807.getClass(), "slideBad", 1334888802);
        setIntField(term3988807, term3988807.getClass(), "breakPerfect", -1542299202);
        setIntField(term3988807, term3988807.getClass(), "breakGreat", 1297862605);
        setIntField(term3988807, term3988807.getClass(), "breakGood", 53358881);
        setIntField(term3988807, term3988807.getClass(), "breakBad", 1295800953);
        setBooleanField(term3988807, term3988807.getClass(), "isTrackSkip", true);
        setBooleanField(term3988807, term3988807.getClass(), "isHighScore", false);
        setBooleanField(term3988807, term3988807.getClass(), "isChallengeTrack", true);
        setIntField(term3988807, term3988807.getClass(), "challengeLife", 345654813);
        setIntField(term3988807, term3988807.getClass(), "challengeRemain", -1082779274);
        setIntField(term3988807, term3988807.getClass(), "isAllPerfectPlus", 2017020552);
        term3989119 = new Integer(1271548455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3989119;
        callMethod(klass, "setHoldGreat", argTypes, term3988807, args);
    }

};


