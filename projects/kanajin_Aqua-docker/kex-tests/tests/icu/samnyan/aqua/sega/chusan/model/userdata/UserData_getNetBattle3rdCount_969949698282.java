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

public class UserData_getNetBattle3rdCount_969949698282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4217812;

    public UserData_getNetBattle3rdCount_969949698282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4217812 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4217812, term4217812.getClass(), "id", 0L);
        setField(term4217812, term4217812.getClass(), "card", null);
        setField(term4217812, term4217812.getClass(), "userName", null);
        setIntField(term4217812, term4217812.getClass(), "level", 0);
        setIntField(term4217812, term4217812.getClass(), "reincarnationNum", 0);
        setField(term4217812, term4217812.getClass(), "exp", null);
        setLongField(term4217812, term4217812.getClass(), "point", 0L);
        setLongField(term4217812, term4217812.getClass(), "totalPoint", 0L);
        setIntField(term4217812, term4217812.getClass(), "playCount", 0);
        setIntField(term4217812, term4217812.getClass(), "multiPlayCount", 0);
        setIntField(term4217812, term4217812.getClass(), "playerRating", 0);
        setIntField(term4217812, term4217812.getClass(), "highestRating", 0);
        setIntField(term4217812, term4217812.getClass(), "nameplateId", 0);
        setIntField(term4217812, term4217812.getClass(), "frameId", 0);
        setIntField(term4217812, term4217812.getClass(), "characterId", 0);
        setIntField(term4217812, term4217812.getClass(), "trophyId", 0);
        setIntField(term4217812, term4217812.getClass(), "playedTutorialBit", 0);
        setIntField(term4217812, term4217812.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4217812, term4217812.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4217812, term4217812.getClass(), "totalMapNum", 0);
        setLongField(term4217812, term4217812.getClass(), "totalHiScore", 0L);
        setLongField(term4217812, term4217812.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4217812, term4217812.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4217812, term4217812.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4217812, term4217812.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4217812, term4217812.getClass(), "totalUltimaHighScore", 0L);
        setField(term4217812, term4217812.getClass(), "eventWatchedDate", null);
        setIntField(term4217812, term4217812.getClass(), "friendCount", 0);
        setField(term4217812, term4217812.getClass(), "firstGameId", null);
        setField(term4217812, term4217812.getClass(), "firstRomVersion", null);
        setField(term4217812, term4217812.getClass(), "firstDataVersion", null);
        setField(term4217812, term4217812.getClass(), "firstPlayDate", null);
        setField(term4217812, term4217812.getClass(), "lastGameId", null);
        setField(term4217812, term4217812.getClass(), "lastRomVersion", null);
        setField(term4217812, term4217812.getClass(), "lastDataVersion", null);
        setField(term4217812, term4217812.getClass(), "lastLoginDate", null);
        setField(term4217812, term4217812.getClass(), "lastPlayDate", null);
        setIntField(term4217812, term4217812.getClass(), "lastPlaceId", 0);
        setField(term4217812, term4217812.getClass(), "lastPlaceName", null);
        setField(term4217812, term4217812.getClass(), "lastRegionId", null);
        setField(term4217812, term4217812.getClass(), "lastRegionName", null);
        setField(term4217812, term4217812.getClass(), "lastAllNetId", null);
        setField(term4217812, term4217812.getClass(), "lastClientId", null);
        setField(term4217812, term4217812.getClass(), "lastCountryCode", null);
        setField(term4217812, term4217812.getClass(), "userNameEx", null);
        setField(term4217812, term4217812.getClass(), "compatibleCmVersion", null);
        setIntField(term4217812, term4217812.getClass(), "medal", 0);
        setIntField(term4217812, term4217812.getClass(), "mapIconId", 0);
        setIntField(term4217812, term4217812.getClass(), "voiceId", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarWear", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarHead", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarFace", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarSkin", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarItem", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarFront", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarBack", 0);
        setIntField(term4217812, term4217812.getClass(), "classEmblemBase", 0);
        setIntField(term4217812, term4217812.getClass(), "classEmblemMedal", 0);
        setIntField(term4217812, term4217812.getClass(), "stockedGridCount", 0);
        setIntField(term4217812, term4217812.getClass(), "exMapLoopCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattlePlayCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattleWinCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattleLoseCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4217812, term4217812.getClass(), "charaIllustId", 0);
        setIntField(term4217812, term4217812.getClass(), "skillId", 0);
        setIntField(term4217812, term4217812.getClass(), "overPowerPoint", 0);
        setIntField(term4217812, term4217812.getClass(), "overPowerRate", 0);
        setIntField(term4217812, term4217812.getClass(), "overPowerLowerRank", 0);
        setIntField(term4217812, term4217812.getClass(), "avatarPoint", 0);
        setIntField(term4217812, term4217812.getClass(), "battleRankId", 0);
        setIntField(term4217812, term4217812.getClass(), "battleRankPoint", 0);
        setIntField(term4217812, term4217812.getClass(), "eliteRankPoint", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattle1stCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattle2ndCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattle3rdCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattle4thCount", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattleCorrection", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattleErrCnt", 0);
        setIntField(term4217812, term4217812.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4217812, term4217812.getClass(), "battleRewardStatus", 0);
        setIntField(term4217812, term4217812.getClass(), "battleRewardIndex", 0);
        setIntField(term4217812, term4217812.getClass(), "battleRewardCount", 0);
        setIntField(term4217812, term4217812.getClass(), "ext1", 0);
        setIntField(term4217812, term4217812.getClass(), "ext2", 0);
        setIntField(term4217812, term4217812.getClass(), "ext3", 0);
        setIntField(term4217812, term4217812.getClass(), "ext4", 0);
        setIntField(term4217812, term4217812.getClass(), "ext5", 0);
        setIntField(term4217812, term4217812.getClass(), "ext6", 0);
        setIntField(term4217812, term4217812.getClass(), "ext7", 0);
        setIntField(term4217812, term4217812.getClass(), "ext8", 0);
        setIntField(term4217812, term4217812.getClass(), "ext9", 0);
        setIntField(term4217812, term4217812.getClass(), "ext10", 0);
        setField(term4217812, term4217812.getClass(), "extStr1", null);
        setField(term4217812, term4217812.getClass(), "extStr2", null);
        setLongField(term4217812, term4217812.getClass(), "extLong1", 0L);
        setLongField(term4217812, term4217812.getClass(), "extLong2", 0L);
        setField(term4217812, term4217812.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4217812, term4217812.getClass(), "isNetBattleHost", false);
        setIntField(term4217812, term4217812.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattle3rdCount", argTypes, term4217812, args);
    }

};


