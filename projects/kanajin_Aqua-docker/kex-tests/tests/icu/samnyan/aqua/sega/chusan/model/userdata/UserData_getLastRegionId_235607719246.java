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

public class UserData_getLastRegionId_235607719246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215040;

    public UserData_getLastRegionId_235607719246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215040 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4215040, term4215040.getClass(), "id", 0L);
        setField(term4215040, term4215040.getClass(), "card", null);
        setField(term4215040, term4215040.getClass(), "userName", null);
        setIntField(term4215040, term4215040.getClass(), "level", 0);
        setIntField(term4215040, term4215040.getClass(), "reincarnationNum", 0);
        setField(term4215040, term4215040.getClass(), "exp", null);
        setLongField(term4215040, term4215040.getClass(), "point", 0L);
        setLongField(term4215040, term4215040.getClass(), "totalPoint", 0L);
        setIntField(term4215040, term4215040.getClass(), "playCount", 0);
        setIntField(term4215040, term4215040.getClass(), "multiPlayCount", 0);
        setIntField(term4215040, term4215040.getClass(), "playerRating", 0);
        setIntField(term4215040, term4215040.getClass(), "highestRating", 0);
        setIntField(term4215040, term4215040.getClass(), "nameplateId", 0);
        setIntField(term4215040, term4215040.getClass(), "frameId", 0);
        setIntField(term4215040, term4215040.getClass(), "characterId", 0);
        setIntField(term4215040, term4215040.getClass(), "trophyId", 0);
        setIntField(term4215040, term4215040.getClass(), "playedTutorialBit", 0);
        setIntField(term4215040, term4215040.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4215040, term4215040.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4215040, term4215040.getClass(), "totalMapNum", 0);
        setLongField(term4215040, term4215040.getClass(), "totalHiScore", 0L);
        setLongField(term4215040, term4215040.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4215040, term4215040.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4215040, term4215040.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4215040, term4215040.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4215040, term4215040.getClass(), "totalUltimaHighScore", 0L);
        setField(term4215040, term4215040.getClass(), "eventWatchedDate", null);
        setIntField(term4215040, term4215040.getClass(), "friendCount", 0);
        setField(term4215040, term4215040.getClass(), "firstGameId", null);
        setField(term4215040, term4215040.getClass(), "firstRomVersion", null);
        setField(term4215040, term4215040.getClass(), "firstDataVersion", null);
        setField(term4215040, term4215040.getClass(), "firstPlayDate", null);
        setField(term4215040, term4215040.getClass(), "lastGameId", null);
        setField(term4215040, term4215040.getClass(), "lastRomVersion", null);
        setField(term4215040, term4215040.getClass(), "lastDataVersion", null);
        setField(term4215040, term4215040.getClass(), "lastLoginDate", null);
        setField(term4215040, term4215040.getClass(), "lastPlayDate", null);
        setIntField(term4215040, term4215040.getClass(), "lastPlaceId", 0);
        setField(term4215040, term4215040.getClass(), "lastPlaceName", null);
        setField(term4215040, term4215040.getClass(), "lastRegionId", null);
        setField(term4215040, term4215040.getClass(), "lastRegionName", null);
        setField(term4215040, term4215040.getClass(), "lastAllNetId", null);
        setField(term4215040, term4215040.getClass(), "lastClientId", null);
        setField(term4215040, term4215040.getClass(), "lastCountryCode", null);
        setField(term4215040, term4215040.getClass(), "userNameEx", null);
        setField(term4215040, term4215040.getClass(), "compatibleCmVersion", null);
        setIntField(term4215040, term4215040.getClass(), "medal", 0);
        setIntField(term4215040, term4215040.getClass(), "mapIconId", 0);
        setIntField(term4215040, term4215040.getClass(), "voiceId", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarWear", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarHead", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarFace", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarSkin", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarItem", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarFront", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarBack", 0);
        setIntField(term4215040, term4215040.getClass(), "classEmblemBase", 0);
        setIntField(term4215040, term4215040.getClass(), "classEmblemMedal", 0);
        setIntField(term4215040, term4215040.getClass(), "stockedGridCount", 0);
        setIntField(term4215040, term4215040.getClass(), "exMapLoopCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattlePlayCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattleWinCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattleLoseCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4215040, term4215040.getClass(), "charaIllustId", 0);
        setIntField(term4215040, term4215040.getClass(), "skillId", 0);
        setIntField(term4215040, term4215040.getClass(), "overPowerPoint", 0);
        setIntField(term4215040, term4215040.getClass(), "overPowerRate", 0);
        setIntField(term4215040, term4215040.getClass(), "overPowerLowerRank", 0);
        setIntField(term4215040, term4215040.getClass(), "avatarPoint", 0);
        setIntField(term4215040, term4215040.getClass(), "battleRankId", 0);
        setIntField(term4215040, term4215040.getClass(), "battleRankPoint", 0);
        setIntField(term4215040, term4215040.getClass(), "eliteRankPoint", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattle1stCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattle2ndCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattle3rdCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattle4thCount", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattleCorrection", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattleErrCnt", 0);
        setIntField(term4215040, term4215040.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4215040, term4215040.getClass(), "battleRewardStatus", 0);
        setIntField(term4215040, term4215040.getClass(), "battleRewardIndex", 0);
        setIntField(term4215040, term4215040.getClass(), "battleRewardCount", 0);
        setIntField(term4215040, term4215040.getClass(), "ext1", 0);
        setIntField(term4215040, term4215040.getClass(), "ext2", 0);
        setIntField(term4215040, term4215040.getClass(), "ext3", 0);
        setIntField(term4215040, term4215040.getClass(), "ext4", 0);
        setIntField(term4215040, term4215040.getClass(), "ext5", 0);
        setIntField(term4215040, term4215040.getClass(), "ext6", 0);
        setIntField(term4215040, term4215040.getClass(), "ext7", 0);
        setIntField(term4215040, term4215040.getClass(), "ext8", 0);
        setIntField(term4215040, term4215040.getClass(), "ext9", 0);
        setIntField(term4215040, term4215040.getClass(), "ext10", 0);
        setField(term4215040, term4215040.getClass(), "extStr1", null);
        setField(term4215040, term4215040.getClass(), "extStr2", null);
        setLongField(term4215040, term4215040.getClass(), "extLong1", 0L);
        setLongField(term4215040, term4215040.getClass(), "extLong2", 0L);
        setField(term4215040, term4215040.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4215040, term4215040.getClass(), "isNetBattleHost", false);
        setIntField(term4215040, term4215040.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term4215040, args);
    }

};


