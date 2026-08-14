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

public class UserDetail_setLastLoginDate_162893736103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254023;

    public UserDetail_setLastLoginDate_162893736103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term254027 = new Long(2990264647913003810L);
        Integer term254090 = new Integer(-745063212);
        Integer term254092 = new Integer(298277204);
        Integer term254094 = new Integer(1536563217);
        Integer term254096 = new Integer(-449582867);
        Integer term254098 = new Integer(-650176523);
        Integer term254100 = new Integer(2071056240);
        Integer term254102 = new Integer(1894657425);
        Integer term254104 = new Integer(-263942209);
        ArrayList term254088 = new ArrayList();
        ((ArrayList) term254088).add(term254090);
        ((ArrayList) term254088).add(term254092);
        ((ArrayList) term254088).add(term254094);
        ((ArrayList) term254088).add(term254096);
        ((ArrayList) term254088).add(term254098);
        ((ArrayList) term254088).add(term254100);
        ((ArrayList) term254088).add(term254102);
        ((ArrayList) term254088).add(term254104);
        Integer term254110 = new Integer(820400430);
        Integer term254112 = new Integer(-1841078275);
        Integer term254114 = new Integer(-875421053);
        Integer term254116 = new Integer(212464780);
        Integer term254118 = new Integer(-1698447008);
        Integer term254120 = new Integer(1429592368);
        Integer term254122 = new Integer(-1997064536);
        Integer term254124 = new Integer(798438929);
        ArrayList term254108 = new ArrayList();
        ((ArrayList) term254108).add(term254110);
        ((ArrayList) term254108).add(term254112);
        ((ArrayList) term254108).add(term254114);
        ((ArrayList) term254108).add(term254116);
        ((ArrayList) term254108).add(term254118);
        ((ArrayList) term254108).add(term254120);
        ((ArrayList) term254108).add(term254122);
        ((ArrayList) term254108).add(term254124);
        term254023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term254025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term254041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term254023, term254023.getClass(), "id", -2932150496469152084L);
        setLongField(term254025, term254025.getClass(), "id", -7259009702298112138L);
        setField(term254025, term254025.getClass(), "extId", term254027);
        setField(term254025, term254025.getClass(), "luid", "ksdQQJdyNW");
        setIntField(term254042, term254042.getClass(), "year", 2012);
        setShortField(term254042, term254042.getClass(), "month", (short) 6);
        setShortField(term254042, term254042.getClass(), "day", (short) 1);
        setField(term254041, term254041.getClass(), "date", term254042);
        setByteField(term254046, term254046.getClass(), "hour", (byte) 14);
        setByteField(term254046, term254046.getClass(), "minute", (byte) 57);
        setByteField(term254046, term254046.getClass(), "second", (byte) 0);
        setIntField(term254046, term254046.getClass(), "nano", 965303069);
        setField(term254041, term254041.getClass(), "time", term254046);
        setField(term254025, term254025.getClass(), "registerTime", term254041);
        setIntField(term254052, term254052.getClass(), "year", 2027);
        setShortField(term254052, term254052.getClass(), "month", (short) 1);
        setShortField(term254052, term254052.getClass(), "day", (short) 31);
        setField(term254051, term254051.getClass(), "date", term254052);
        setByteField(term254056, term254056.getClass(), "hour", (byte) 16);
        setByteField(term254056, term254056.getClass(), "minute", (byte) 7);
        setByteField(term254056, term254056.getClass(), "second", (byte) 38);
        setIntField(term254056, term254056.getClass(), "nano", 713069905);
        setField(term254051, term254051.getClass(), "time", term254056);
        setField(term254025, term254025.getClass(), "accessTime", term254051);
        setField(term254023, term254023.getClass(), "card", term254025);
        setField(term254023, term254023.getClass(), "userName", "OMmpfwVAqq");
        setIntField(term254023, term254023.getClass(), "isNetMember", -1090929128);
        setIntField(term254023, term254023.getClass(), "iconId", -6828656);
        setIntField(term254023, term254023.getClass(), "plateId", 1326729269);
        setIntField(term254023, term254023.getClass(), "titleId", -1895397861);
        setIntField(term254023, term254023.getClass(), "partnerId", 1716602593);
        setIntField(term254023, term254023.getClass(), "frameId", 1259032686);
        setIntField(term254023, term254023.getClass(), "selectMapId", -753648604);
        setIntField(term254023, term254023.getClass(), "totalAwake", 389915231);
        setIntField(term254023, term254023.getClass(), "gradeRating", 804747162);
        setIntField(term254023, term254023.getClass(), "musicRating", -791466650);
        setIntField(term254023, term254023.getClass(), "playerRating", -523835907);
        setIntField(term254023, term254023.getClass(), "highestRating", 385209642);
        setIntField(term254023, term254023.getClass(), "gradeRank", -1815702004);
        setIntField(term254023, term254023.getClass(), "classRank", 1141075113);
        setIntField(term254023, term254023.getClass(), "courseRank", 1643922073);
        setField(term254023, term254023.getClass(), "charaSlot", term254088);
        setField(term254023, term254023.getClass(), "charaLockSlot", term254108);
        setLongField(term254023, term254023.getClass(), "contentBit", 7057503709209654076L);
        setIntField(term254023, term254023.getClass(), "playCount", -1512971740);
        setField(term254023, term254023.getClass(), "eventWatchedDate", "epjWinvtVU");
        setField(term254023, term254023.getClass(), "lastGameId", "UjaiuciVbk");
        setField(term254023, term254023.getClass(), "lastRomVersion", "RWHiRCpYTv");
        setField(term254023, term254023.getClass(), "lastDataVersion", "bkkYKGVZSl");
        setField(term254023, term254023.getClass(), "lastLoginDate", "zxSymDvdRR");
        setField(term254023, term254023.getClass(), "lastPlayDate", "vLzflhmVIO");
        setIntField(term254023, term254023.getClass(), "lastPlayCredit", 935946945);
        setIntField(term254023, term254023.getClass(), "lastPlayMode", -143105487);
        setIntField(term254023, term254023.getClass(), "lastPlaceId", 16612505);
        setField(term254023, term254023.getClass(), "lastPlaceName", "iclAYiudke");
        setIntField(term254023, term254023.getClass(), "lastAllNetId", 1873376410);
        setIntField(term254023, term254023.getClass(), "lastRegionId", -507501606);
        setField(term254023, term254023.getClass(), "lastRegionName", "cCwSyZEBIb");
        setField(term254023, term254023.getClass(), "lastClientId", "AtXchNEfAh");
        setField(term254023, term254023.getClass(), "lastCountryCode", "OfUGaofOyl");
        setIntField(term254023, term254023.getClass(), "lastSelectEMoney", 178633218);
        setIntField(term254023, term254023.getClass(), "lastSelectTicket", -2006303407);
        setIntField(term254023, term254023.getClass(), "lastSelectCourse", -1787834533);
        setIntField(term254023, term254023.getClass(), "lastCountCourse", 1502613791);
        setField(term254023, term254023.getClass(), "firstGameId", "hmqmJaPVoG");
        setField(term254023, term254023.getClass(), "firstRomVersion", "pNTxRrBYYn");
        setField(term254023, term254023.getClass(), "firstDataVersion", "EavfKjgzgQ");
        setField(term254023, term254023.getClass(), "firstPlayDate", "efyImakJaR");
        setField(term254023, term254023.getClass(), "compatibleCmVersion", "eryxzqFfFf");
        setField(term254023, term254023.getClass(), "dailyBonusDate", "aAFUdZslxJ");
        setField(term254023, term254023.getClass(), "dailyCourseBonusDate", "gMrywiVyIr");
        setField(term254023, term254023.getClass(), "lastPairLoginDate", "iyZjIacLsw");
        setField(term254023, term254023.getClass(), "lastTrialPlayDate", "vYkgboKVHZ");
        setIntField(term254023, term254023.getClass(), "playVsCount", -258767694);
        setIntField(term254023, term254023.getClass(), "playSyncCount", -1209689852);
        setIntField(term254023, term254023.getClass(), "winCount", 1861949155);
        setIntField(term254023, term254023.getClass(), "helpCount", -1997894313);
        setIntField(term254023, term254023.getClass(), "comboCount", -788461525);
        setLongField(term254023, term254023.getClass(), "totalDeluxscore", -1411326838937531130L);
        setLongField(term254023, term254023.getClass(), "totalBasicDeluxscore", -5597628323481569262L);
        setLongField(term254023, term254023.getClass(), "totalAdvancedDeluxscore", -3413460727271783379L);
        setLongField(term254023, term254023.getClass(), "totalExpertDeluxscore", 2281005994348867482L);
        setLongField(term254023, term254023.getClass(), "totalMasterDeluxscore", 7935287799944910045L);
        setLongField(term254023, term254023.getClass(), "totalReMasterDeluxscore", -5063865438376567533L);
        setIntField(term254023, term254023.getClass(), "totalSync", 1411975762);
        setIntField(term254023, term254023.getClass(), "totalBasicSync", -671901253);
        setIntField(term254023, term254023.getClass(), "totalAdvancedSync", -1402427175);
        setIntField(term254023, term254023.getClass(), "totalExpertSync", -455255888);
        setIntField(term254023, term254023.getClass(), "totalMasterSync", 1736913133);
        setIntField(term254023, term254023.getClass(), "totalReMasterSync", 80001823);
        setLongField(term254023, term254023.getClass(), "totalAchievement", 4378405141828434888L);
        setLongField(term254023, term254023.getClass(), "totalBasicAchievement", -3556381476610472081L);
        setLongField(term254023, term254023.getClass(), "totalAdvancedAchievement", -9011291151809046051L);
        setLongField(term254023, term254023.getClass(), "totalExpertAchievement", 5558367612217169533L);
        setLongField(term254023, term254023.getClass(), "totalMasterAchievement", -1981056274386005998L);
        setLongField(term254023, term254023.getClass(), "totalReMasterAchievement", -7206549361953251767L);
        setLongField(term254023, term254023.getClass(), "playerOldRating", -2077408996802686108L);
        setLongField(term254023, term254023.getClass(), "playerNewRating", 4747843105761344706L);
        setIntField(term254023, term254023.getClass(), "banState", -132224670);
        setLongField(term254023, term254023.getClass(), "dateTime", -3804104062705189605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IaGDRvnqIb";
        callMethod(klass, "setLastLoginDate", argTypes, term254023, args);
    }

};


