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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserFavorite_canEqual_176137611212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570859;
     Object term571240;

    public UserFavorite_canEqual_176137611212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term570865 = new Long(-1721083210597101555L);
        Integer term570928 = new Integer(1617630705);
        Integer term570930 = new Integer(-2035560140);
        Integer term570932 = new Integer(532665626);
        Integer term570934 = new Integer(1052620858);
        Integer term570936 = new Integer(784368731);
        Integer term570938 = new Integer(-325400272);
        Integer term570940 = new Integer(-439065543);
        Integer term570942 = new Integer(-2067100921);
        Integer term570944 = new Integer(-630380701);
        ArrayList term570926 = new ArrayList();
        ((ArrayList) term570926).add(term570928);
        ((ArrayList) term570926).add(term570930);
        ((ArrayList) term570926).add(term570932);
        ((ArrayList) term570926).add(term570934);
        ((ArrayList) term570926).add(term570936);
        ((ArrayList) term570926).add(term570938);
        ((ArrayList) term570926).add(term570940);
        ((ArrayList) term570926).add(term570942);
        ((ArrayList) term570926).add(term570944);
        Integer term570950 = new Integer(-1571228038);
        ArrayList term570948 = new ArrayList();
        ((ArrayList) term570948).add(term570950);
        Integer term571224 = new Integer(483151429);
        Integer term571226 = new Integer(-292946895);
        Integer term571228 = new Integer(-1582974640);
        Integer term571230 = new Integer(-425384218);
        Integer term571232 = new Integer(-1593819000);
        Integer term571234 = new Integer(-358856964);
        Integer term571236 = new Integer(-367287466);
        ArrayList term571222 = new ArrayList();
        ((ArrayList) term571222).add(term571224);
        ((ArrayList) term571222).add(term571226);
        ((ArrayList) term571222).add(term571228);
        ((ArrayList) term571222).add(term571230);
        ((ArrayList) term571222).add(term571232);
        ((ArrayList) term571222).add(term571234);
        ((ArrayList) term571222).add(term571236);
        term570859 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite"));
        Object term570861 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term570863 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term570879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term570880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term570884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term570889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term570890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term570894 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term570859, term570859.getClass(), "id", -6010920215068187552L);
        setLongField(term570861, term570861.getClass(), "id", -8051011040071124931L);
        setLongField(term570863, term570863.getClass(), "id", 5678855222391840117L);
        setField(term570863, term570863.getClass(), "extId", term570865);
        setField(term570863, term570863.getClass(), "luid", "yZooqMomhC");
        setIntField(term570880, term570880.getClass(), "year", 2029);
        setShortField(term570880, term570880.getClass(), "month", (short) 4);
        setShortField(term570880, term570880.getClass(), "day", (short) 20);
        setField(term570879, term570879.getClass(), "date", term570880);
        setByteField(term570884, term570884.getClass(), "hour", (byte) 8);
        setByteField(term570884, term570884.getClass(), "minute", (byte) 8);
        setByteField(term570884, term570884.getClass(), "second", (byte) 39);
        setIntField(term570884, term570884.getClass(), "nano", 45548450);
        setField(term570879, term570879.getClass(), "time", term570884);
        setField(term570863, term570863.getClass(), "registerTime", term570879);
        setIntField(term570890, term570890.getClass(), "year", 2015);
        setShortField(term570890, term570890.getClass(), "month", (short) 1);
        setShortField(term570890, term570890.getClass(), "day", (short) 14);
        setField(term570889, term570889.getClass(), "date", term570890);
        setByteField(term570894, term570894.getClass(), "hour", (byte) 17);
        setByteField(term570894, term570894.getClass(), "minute", (byte) 48);
        setByteField(term570894, term570894.getClass(), "second", (byte) 25);
        setIntField(term570894, term570894.getClass(), "nano", 585352469);
        setField(term570889, term570889.getClass(), "time", term570894);
        setField(term570863, term570863.getClass(), "accessTime", term570889);
        setField(term570861, term570861.getClass(), "card", term570863);
        setField(term570861, term570861.getClass(), "userName", "aNqINRgqHx");
        setIntField(term570861, term570861.getClass(), "isNetMember", 528481327);
        setIntField(term570861, term570861.getClass(), "iconId", 475077565);
        setIntField(term570861, term570861.getClass(), "plateId", -1191870575);
        setIntField(term570861, term570861.getClass(), "titleId", 945337574);
        setIntField(term570861, term570861.getClass(), "partnerId", 704704683);
        setIntField(term570861, term570861.getClass(), "frameId", 18988202);
        setIntField(term570861, term570861.getClass(), "selectMapId", 944834835);
        setIntField(term570861, term570861.getClass(), "totalAwake", -1496587022);
        setIntField(term570861, term570861.getClass(), "gradeRating", -1473268970);
        setIntField(term570861, term570861.getClass(), "musicRating", 1774420371);
        setIntField(term570861, term570861.getClass(), "playerRating", 30308255);
        setIntField(term570861, term570861.getClass(), "highestRating", -1789792854);
        setIntField(term570861, term570861.getClass(), "gradeRank", -1924751752);
        setIntField(term570861, term570861.getClass(), "classRank", -822552864);
        setIntField(term570861, term570861.getClass(), "courseRank", 950333196);
        setField(term570861, term570861.getClass(), "charaSlot", term570926);
        setField(term570861, term570861.getClass(), "charaLockSlot", term570948);
        setLongField(term570861, term570861.getClass(), "contentBit", 8052213256110067827L);
        setIntField(term570861, term570861.getClass(), "playCount", 1407239580);
        setField(term570861, term570861.getClass(), "eventWatchedDate", "gYojprZcmi");
        setField(term570861, term570861.getClass(), "lastGameId", "VPmpYVMkDM");
        setField(term570861, term570861.getClass(), "lastRomVersion", "xdkJEFnVgA");
        setField(term570861, term570861.getClass(), "lastDataVersion", "BoBHlSscpa");
        setField(term570861, term570861.getClass(), "lastLoginDate", "ZtgLkcWTYb");
        setField(term570861, term570861.getClass(), "lastPlayDate", "kQZyenYYPT");
        setIntField(term570861, term570861.getClass(), "lastPlayCredit", -715173871);
        setIntField(term570861, term570861.getClass(), "lastPlayMode", 426566762);
        setIntField(term570861, term570861.getClass(), "lastPlaceId", -1102319933);
        setField(term570861, term570861.getClass(), "lastPlaceName", "hDZGlimnqG");
        setIntField(term570861, term570861.getClass(), "lastAllNetId", -2073180645);
        setIntField(term570861, term570861.getClass(), "lastRegionId", 879012508);
        setField(term570861, term570861.getClass(), "lastRegionName", "nsouzYxbHK");
        setField(term570861, term570861.getClass(), "lastClientId", "NfugNisiSn");
        setField(term570861, term570861.getClass(), "lastCountryCode", "JHzxtLktWU");
        setIntField(term570861, term570861.getClass(), "lastSelectEMoney", -2007103119);
        setIntField(term570861, term570861.getClass(), "lastSelectTicket", 1902071973);
        setIntField(term570861, term570861.getClass(), "lastSelectCourse", 1798441554);
        setIntField(term570861, term570861.getClass(), "lastCountCourse", -1358214697);
        setField(term570861, term570861.getClass(), "firstGameId", "RlySCfSRBE");
        setField(term570861, term570861.getClass(), "firstRomVersion", "kNbtVisUyQ");
        setField(term570861, term570861.getClass(), "firstDataVersion", "rouCZeuCuY");
        setField(term570861, term570861.getClass(), "firstPlayDate", "qQdkgAuqxf");
        setField(term570861, term570861.getClass(), "compatibleCmVersion", "fLveSSSBvF");
        setField(term570861, term570861.getClass(), "dailyBonusDate", "YvhBiPwzkk");
        setField(term570861, term570861.getClass(), "dailyCourseBonusDate", "rnRLwLLZRa");
        setField(term570861, term570861.getClass(), "lastPairLoginDate", "NgAgVnPIgu");
        setField(term570861, term570861.getClass(), "lastTrialPlayDate", "KQmUeJnXQQ");
        setIntField(term570861, term570861.getClass(), "playVsCount", 14656466);
        setIntField(term570861, term570861.getClass(), "playSyncCount", -1047932372);
        setIntField(term570861, term570861.getClass(), "winCount", 1173171099);
        setIntField(term570861, term570861.getClass(), "helpCount", 752822851);
        setIntField(term570861, term570861.getClass(), "comboCount", 588551801);
        setLongField(term570861, term570861.getClass(), "totalDeluxscore", -7054559883998155572L);
        setLongField(term570861, term570861.getClass(), "totalBasicDeluxscore", -5454435060068533642L);
        setLongField(term570861, term570861.getClass(), "totalAdvancedDeluxscore", 7147254474748418736L);
        setLongField(term570861, term570861.getClass(), "totalExpertDeluxscore", 7722171869356837682L);
        setLongField(term570861, term570861.getClass(), "totalMasterDeluxscore", -426015035964949862L);
        setLongField(term570861, term570861.getClass(), "totalReMasterDeluxscore", -7348404829864630471L);
        setIntField(term570861, term570861.getClass(), "totalSync", -651392048);
        setIntField(term570861, term570861.getClass(), "totalBasicSync", 1168568081);
        setIntField(term570861, term570861.getClass(), "totalAdvancedSync", 773687592);
        setIntField(term570861, term570861.getClass(), "totalExpertSync", 1927758611);
        setIntField(term570861, term570861.getClass(), "totalMasterSync", -2013529429);
        setIntField(term570861, term570861.getClass(), "totalReMasterSync", -1520060317);
        setLongField(term570861, term570861.getClass(), "totalAchievement", -2142678713636943441L);
        setLongField(term570861, term570861.getClass(), "totalBasicAchievement", -6707942705455763734L);
        setLongField(term570861, term570861.getClass(), "totalAdvancedAchievement", -8591713025375391348L);
        setLongField(term570861, term570861.getClass(), "totalExpertAchievement", -5253969547880462130L);
        setLongField(term570861, term570861.getClass(), "totalMasterAchievement", -8043680557099502778L);
        setLongField(term570861, term570861.getClass(), "totalReMasterAchievement", -5599310777984733627L);
        setLongField(term570861, term570861.getClass(), "playerOldRating", 5566498806047145644L);
        setLongField(term570861, term570861.getClass(), "playerNewRating", 3381165783759543905L);
        setIntField(term570861, term570861.getClass(), "banState", 368984284);
        setLongField(term570861, term570861.getClass(), "dateTime", 4907088383174605262L);
        setField(term570859, term570859.getClass(), "user", term570861);
        setLongField(term570859, term570859.getClass(), "favUserId", 4308627310092163857L);
        setIntField(term570859, term570859.getClass(), "itemKind", -388306168);
        setField(term570859, term570859.getClass(), "itemIdList", term571222);
        term571240 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term571240;
        callMethod(klass, "canEqual", argTypes, term570859, args);
    }

};


