package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setTotalPoint_1973318947314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220284;
     Object term4220361;

    public UserData_setTotalPoint_1973318947314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220284 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220284, term4220284.getClass(), "id", 0L);
        setField(term4220284, term4220284.getClass(), "card", null);
        setField(term4220284, term4220284.getClass(), "userName", null);
        setIntField(term4220284, term4220284.getClass(), "level", 0);
        setIntField(term4220284, term4220284.getClass(), "reincarnationNum", 0);
        setField(term4220284, term4220284.getClass(), "exp", null);
        setLongField(term4220284, term4220284.getClass(), "point", 0L);
        setLongField(term4220284, term4220284.getClass(), "totalPoint", 0L);
        setIntField(term4220284, term4220284.getClass(), "playCount", 0);
        setIntField(term4220284, term4220284.getClass(), "multiPlayCount", 0);
        setIntField(term4220284, term4220284.getClass(), "playerRating", 0);
        setIntField(term4220284, term4220284.getClass(), "highestRating", 0);
        setIntField(term4220284, term4220284.getClass(), "nameplateId", 0);
        setIntField(term4220284, term4220284.getClass(), "frameId", 0);
        setIntField(term4220284, term4220284.getClass(), "characterId", 0);
        setIntField(term4220284, term4220284.getClass(), "trophyId", 0);
        setIntField(term4220284, term4220284.getClass(), "playedTutorialBit", 0);
        setIntField(term4220284, term4220284.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220284, term4220284.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220284, term4220284.getClass(), "totalMapNum", 0);
        setLongField(term4220284, term4220284.getClass(), "totalHiScore", 0L);
        setLongField(term4220284, term4220284.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220284, term4220284.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220284, term4220284.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220284, term4220284.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220284, term4220284.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220284, term4220284.getClass(), "eventWatchedDate", null);
        setIntField(term4220284, term4220284.getClass(), "friendCount", 0);
        setField(term4220284, term4220284.getClass(), "firstGameId", null);
        setField(term4220284, term4220284.getClass(), "firstRomVersion", null);
        setField(term4220284, term4220284.getClass(), "firstDataVersion", null);
        setField(term4220284, term4220284.getClass(), "firstPlayDate", null);
        setField(term4220284, term4220284.getClass(), "lastGameId", null);
        setField(term4220284, term4220284.getClass(), "lastRomVersion", null);
        setField(term4220284, term4220284.getClass(), "lastDataVersion", null);
        setField(term4220284, term4220284.getClass(), "lastLoginDate", null);
        setField(term4220284, term4220284.getClass(), "lastPlayDate", null);
        setIntField(term4220284, term4220284.getClass(), "lastPlaceId", 0);
        setField(term4220284, term4220284.getClass(), "lastPlaceName", null);
        setField(term4220284, term4220284.getClass(), "lastRegionId", null);
        setField(term4220284, term4220284.getClass(), "lastRegionName", null);
        setField(term4220284, term4220284.getClass(), "lastAllNetId", null);
        setField(term4220284, term4220284.getClass(), "lastClientId", null);
        setField(term4220284, term4220284.getClass(), "lastCountryCode", null);
        setField(term4220284, term4220284.getClass(), "userNameEx", null);
        setField(term4220284, term4220284.getClass(), "compatibleCmVersion", null);
        setIntField(term4220284, term4220284.getClass(), "medal", 0);
        setIntField(term4220284, term4220284.getClass(), "mapIconId", 0);
        setIntField(term4220284, term4220284.getClass(), "voiceId", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarWear", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarHead", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarFace", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarSkin", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarItem", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarFront", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarBack", 0);
        setIntField(term4220284, term4220284.getClass(), "classEmblemBase", 0);
        setIntField(term4220284, term4220284.getClass(), "classEmblemMedal", 0);
        setIntField(term4220284, term4220284.getClass(), "stockedGridCount", 0);
        setIntField(term4220284, term4220284.getClass(), "exMapLoopCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattleWinCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220284, term4220284.getClass(), "charaIllustId", 0);
        setIntField(term4220284, term4220284.getClass(), "skillId", 0);
        setIntField(term4220284, term4220284.getClass(), "overPowerPoint", 0);
        setIntField(term4220284, term4220284.getClass(), "overPowerRate", 0);
        setIntField(term4220284, term4220284.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220284, term4220284.getClass(), "avatarPoint", 0);
        setIntField(term4220284, term4220284.getClass(), "battleRankId", 0);
        setIntField(term4220284, term4220284.getClass(), "battleRankPoint", 0);
        setIntField(term4220284, term4220284.getClass(), "eliteRankPoint", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattle1stCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattle4thCount", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattleCorrection", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220284, term4220284.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220284, term4220284.getClass(), "battleRewardStatus", 0);
        setIntField(term4220284, term4220284.getClass(), "battleRewardIndex", 0);
        setIntField(term4220284, term4220284.getClass(), "battleRewardCount", 0);
        setIntField(term4220284, term4220284.getClass(), "ext1", 0);
        setIntField(term4220284, term4220284.getClass(), "ext2", 0);
        setIntField(term4220284, term4220284.getClass(), "ext3", 0);
        setIntField(term4220284, term4220284.getClass(), "ext4", 0);
        setIntField(term4220284, term4220284.getClass(), "ext5", 0);
        setIntField(term4220284, term4220284.getClass(), "ext6", 0);
        setIntField(term4220284, term4220284.getClass(), "ext7", 0);
        setIntField(term4220284, term4220284.getClass(), "ext8", 0);
        setIntField(term4220284, term4220284.getClass(), "ext9", 0);
        setIntField(term4220284, term4220284.getClass(), "ext10", 0);
        setField(term4220284, term4220284.getClass(), "extStr1", null);
        setField(term4220284, term4220284.getClass(), "extStr2", null);
        setLongField(term4220284, term4220284.getClass(), "extLong1", 0L);
        setLongField(term4220284, term4220284.getClass(), "extLong2", 0L);
        setField(term4220284, term4220284.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220284, term4220284.getClass(), "isNetBattleHost", false);
        setIntField(term4220284, term4220284.getClass(), "netBattleEndState", 0);
        term4220361 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4220361;
        callMethod(klass, "setTotalPoint", argTypes, term4220284, args);
    }

};


