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

public class UserData_setPoint_2091958659312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285604;
     Object term285681;

    public UserData_setPoint_2091958659312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285604 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285604, term285604.getClass(), "id", 0L);
        setField(term285604, term285604.getClass(), "card", null);
        setField(term285604, term285604.getClass(), "userName", null);
        setIntField(term285604, term285604.getClass(), "level", 0);
        setIntField(term285604, term285604.getClass(), "reincarnationNum", 0);
        setField(term285604, term285604.getClass(), "exp", null);
        setLongField(term285604, term285604.getClass(), "point", 0L);
        setLongField(term285604, term285604.getClass(), "totalPoint", 0L);
        setIntField(term285604, term285604.getClass(), "playCount", 0);
        setIntField(term285604, term285604.getClass(), "multiPlayCount", 0);
        setIntField(term285604, term285604.getClass(), "playerRating", 0);
        setIntField(term285604, term285604.getClass(), "highestRating", 0);
        setIntField(term285604, term285604.getClass(), "nameplateId", 0);
        setIntField(term285604, term285604.getClass(), "frameId", 0);
        setIntField(term285604, term285604.getClass(), "characterId", 0);
        setIntField(term285604, term285604.getClass(), "trophyId", 0);
        setIntField(term285604, term285604.getClass(), "playedTutorialBit", 0);
        setIntField(term285604, term285604.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285604, term285604.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285604, term285604.getClass(), "totalMapNum", 0);
        setLongField(term285604, term285604.getClass(), "totalHiScore", 0L);
        setLongField(term285604, term285604.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285604, term285604.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285604, term285604.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285604, term285604.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285604, term285604.getClass(), "totalUltimaHighScore", 0L);
        setField(term285604, term285604.getClass(), "eventWatchedDate", null);
        setIntField(term285604, term285604.getClass(), "friendCount", 0);
        setField(term285604, term285604.getClass(), "firstGameId", null);
        setField(term285604, term285604.getClass(), "firstRomVersion", null);
        setField(term285604, term285604.getClass(), "firstDataVersion", null);
        setField(term285604, term285604.getClass(), "firstPlayDate", null);
        setField(term285604, term285604.getClass(), "lastGameId", null);
        setField(term285604, term285604.getClass(), "lastRomVersion", null);
        setField(term285604, term285604.getClass(), "lastDataVersion", null);
        setField(term285604, term285604.getClass(), "lastLoginDate", null);
        setField(term285604, term285604.getClass(), "lastPlayDate", null);
        setIntField(term285604, term285604.getClass(), "lastPlaceId", 0);
        setField(term285604, term285604.getClass(), "lastPlaceName", null);
        setField(term285604, term285604.getClass(), "lastRegionId", null);
        setField(term285604, term285604.getClass(), "lastRegionName", null);
        setField(term285604, term285604.getClass(), "lastAllNetId", null);
        setField(term285604, term285604.getClass(), "lastClientId", null);
        setField(term285604, term285604.getClass(), "lastCountryCode", null);
        setField(term285604, term285604.getClass(), "userNameEx", null);
        setField(term285604, term285604.getClass(), "compatibleCmVersion", null);
        setIntField(term285604, term285604.getClass(), "medal", 0);
        setIntField(term285604, term285604.getClass(), "mapIconId", 0);
        setIntField(term285604, term285604.getClass(), "voiceId", 0);
        setIntField(term285604, term285604.getClass(), "avatarWear", 0);
        setIntField(term285604, term285604.getClass(), "avatarHead", 0);
        setIntField(term285604, term285604.getClass(), "avatarFace", 0);
        setIntField(term285604, term285604.getClass(), "avatarSkin", 0);
        setIntField(term285604, term285604.getClass(), "avatarItem", 0);
        setIntField(term285604, term285604.getClass(), "avatarFront", 0);
        setIntField(term285604, term285604.getClass(), "avatarBack", 0);
        setIntField(term285604, term285604.getClass(), "classEmblemBase", 0);
        setIntField(term285604, term285604.getClass(), "classEmblemMedal", 0);
        setIntField(term285604, term285604.getClass(), "stockedGridCount", 0);
        setIntField(term285604, term285604.getClass(), "exMapLoopCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattlePlayCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattleWinCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattleLoseCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285604, term285604.getClass(), "charaIllustId", 0);
        setIntField(term285604, term285604.getClass(), "skillId", 0);
        setIntField(term285604, term285604.getClass(), "overPowerPoint", 0);
        setIntField(term285604, term285604.getClass(), "overPowerRate", 0);
        setIntField(term285604, term285604.getClass(), "overPowerLowerRank", 0);
        setIntField(term285604, term285604.getClass(), "avatarPoint", 0);
        setIntField(term285604, term285604.getClass(), "battleRankId", 0);
        setIntField(term285604, term285604.getClass(), "battleRankPoint", 0);
        setIntField(term285604, term285604.getClass(), "eliteRankPoint", 0);
        setIntField(term285604, term285604.getClass(), "netBattle1stCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattle2ndCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattle3rdCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattle4thCount", 0);
        setIntField(term285604, term285604.getClass(), "netBattleCorrection", 0);
        setIntField(term285604, term285604.getClass(), "netBattleErrCnt", 0);
        setIntField(term285604, term285604.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285604, term285604.getClass(), "battleRewardStatus", 0);
        setIntField(term285604, term285604.getClass(), "battleRewardIndex", 0);
        setIntField(term285604, term285604.getClass(), "battleRewardCount", 0);
        setIntField(term285604, term285604.getClass(), "ext1", 0);
        setIntField(term285604, term285604.getClass(), "ext2", 0);
        setIntField(term285604, term285604.getClass(), "ext3", 0);
        setIntField(term285604, term285604.getClass(), "ext4", 0);
        setIntField(term285604, term285604.getClass(), "ext5", 0);
        setIntField(term285604, term285604.getClass(), "ext6", 0);
        setIntField(term285604, term285604.getClass(), "ext7", 0);
        setIntField(term285604, term285604.getClass(), "ext8", 0);
        setIntField(term285604, term285604.getClass(), "ext9", 0);
        setIntField(term285604, term285604.getClass(), "ext10", 0);
        setField(term285604, term285604.getClass(), "extStr1", null);
        setField(term285604, term285604.getClass(), "extStr2", null);
        setLongField(term285604, term285604.getClass(), "extLong1", 0L);
        setLongField(term285604, term285604.getClass(), "extLong2", 0L);
        setField(term285604, term285604.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285604, term285604.getClass(), "isNetBattleHost", false);
        setIntField(term285604, term285604.getClass(), "netBattleEndState", 0);
        term285681 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term285681;
        callMethod(klass, "setPoint", argTypes, term285604, args);
    }

};


