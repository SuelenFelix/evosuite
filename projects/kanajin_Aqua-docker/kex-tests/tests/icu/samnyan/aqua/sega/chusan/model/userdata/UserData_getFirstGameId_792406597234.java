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

public class UserData_getFirstGameId_792406597234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279592;

    public UserData_getFirstGameId_792406597234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279592 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term279592, term279592.getClass(), "id", 0L);
        setField(term279592, term279592.getClass(), "card", null);
        setField(term279592, term279592.getClass(), "userName", null);
        setIntField(term279592, term279592.getClass(), "level", 0);
        setIntField(term279592, term279592.getClass(), "reincarnationNum", 0);
        setField(term279592, term279592.getClass(), "exp", null);
        setLongField(term279592, term279592.getClass(), "point", 0L);
        setLongField(term279592, term279592.getClass(), "totalPoint", 0L);
        setIntField(term279592, term279592.getClass(), "playCount", 0);
        setIntField(term279592, term279592.getClass(), "multiPlayCount", 0);
        setIntField(term279592, term279592.getClass(), "playerRating", 0);
        setIntField(term279592, term279592.getClass(), "highestRating", 0);
        setIntField(term279592, term279592.getClass(), "nameplateId", 0);
        setIntField(term279592, term279592.getClass(), "frameId", 0);
        setIntField(term279592, term279592.getClass(), "characterId", 0);
        setIntField(term279592, term279592.getClass(), "trophyId", 0);
        setIntField(term279592, term279592.getClass(), "playedTutorialBit", 0);
        setIntField(term279592, term279592.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term279592, term279592.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term279592, term279592.getClass(), "totalMapNum", 0);
        setLongField(term279592, term279592.getClass(), "totalHiScore", 0L);
        setLongField(term279592, term279592.getClass(), "totalBasicHighScore", 0L);
        setLongField(term279592, term279592.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term279592, term279592.getClass(), "totalExpertHighScore", 0L);
        setLongField(term279592, term279592.getClass(), "totalMasterHighScore", 0L);
        setLongField(term279592, term279592.getClass(), "totalUltimaHighScore", 0L);
        setField(term279592, term279592.getClass(), "eventWatchedDate", null);
        setIntField(term279592, term279592.getClass(), "friendCount", 0);
        setField(term279592, term279592.getClass(), "firstGameId", null);
        setField(term279592, term279592.getClass(), "firstRomVersion", null);
        setField(term279592, term279592.getClass(), "firstDataVersion", null);
        setField(term279592, term279592.getClass(), "firstPlayDate", null);
        setField(term279592, term279592.getClass(), "lastGameId", null);
        setField(term279592, term279592.getClass(), "lastRomVersion", null);
        setField(term279592, term279592.getClass(), "lastDataVersion", null);
        setField(term279592, term279592.getClass(), "lastLoginDate", null);
        setField(term279592, term279592.getClass(), "lastPlayDate", null);
        setIntField(term279592, term279592.getClass(), "lastPlaceId", 0);
        setField(term279592, term279592.getClass(), "lastPlaceName", null);
        setField(term279592, term279592.getClass(), "lastRegionId", null);
        setField(term279592, term279592.getClass(), "lastRegionName", null);
        setField(term279592, term279592.getClass(), "lastAllNetId", null);
        setField(term279592, term279592.getClass(), "lastClientId", null);
        setField(term279592, term279592.getClass(), "lastCountryCode", null);
        setField(term279592, term279592.getClass(), "userNameEx", null);
        setField(term279592, term279592.getClass(), "compatibleCmVersion", null);
        setIntField(term279592, term279592.getClass(), "medal", 0);
        setIntField(term279592, term279592.getClass(), "mapIconId", 0);
        setIntField(term279592, term279592.getClass(), "voiceId", 0);
        setIntField(term279592, term279592.getClass(), "avatarWear", 0);
        setIntField(term279592, term279592.getClass(), "avatarHead", 0);
        setIntField(term279592, term279592.getClass(), "avatarFace", 0);
        setIntField(term279592, term279592.getClass(), "avatarSkin", 0);
        setIntField(term279592, term279592.getClass(), "avatarItem", 0);
        setIntField(term279592, term279592.getClass(), "avatarFront", 0);
        setIntField(term279592, term279592.getClass(), "avatarBack", 0);
        setIntField(term279592, term279592.getClass(), "classEmblemBase", 0);
        setIntField(term279592, term279592.getClass(), "classEmblemMedal", 0);
        setIntField(term279592, term279592.getClass(), "stockedGridCount", 0);
        setIntField(term279592, term279592.getClass(), "exMapLoopCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattlePlayCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattleWinCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattleLoseCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term279592, term279592.getClass(), "charaIllustId", 0);
        setIntField(term279592, term279592.getClass(), "skillId", 0);
        setIntField(term279592, term279592.getClass(), "overPowerPoint", 0);
        setIntField(term279592, term279592.getClass(), "overPowerRate", 0);
        setIntField(term279592, term279592.getClass(), "overPowerLowerRank", 0);
        setIntField(term279592, term279592.getClass(), "avatarPoint", 0);
        setIntField(term279592, term279592.getClass(), "battleRankId", 0);
        setIntField(term279592, term279592.getClass(), "battleRankPoint", 0);
        setIntField(term279592, term279592.getClass(), "eliteRankPoint", 0);
        setIntField(term279592, term279592.getClass(), "netBattle1stCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattle2ndCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattle3rdCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattle4thCount", 0);
        setIntField(term279592, term279592.getClass(), "netBattleCorrection", 0);
        setIntField(term279592, term279592.getClass(), "netBattleErrCnt", 0);
        setIntField(term279592, term279592.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term279592, term279592.getClass(), "battleRewardStatus", 0);
        setIntField(term279592, term279592.getClass(), "battleRewardIndex", 0);
        setIntField(term279592, term279592.getClass(), "battleRewardCount", 0);
        setIntField(term279592, term279592.getClass(), "ext1", 0);
        setIntField(term279592, term279592.getClass(), "ext2", 0);
        setIntField(term279592, term279592.getClass(), "ext3", 0);
        setIntField(term279592, term279592.getClass(), "ext4", 0);
        setIntField(term279592, term279592.getClass(), "ext5", 0);
        setIntField(term279592, term279592.getClass(), "ext6", 0);
        setIntField(term279592, term279592.getClass(), "ext7", 0);
        setIntField(term279592, term279592.getClass(), "ext8", 0);
        setIntField(term279592, term279592.getClass(), "ext9", 0);
        setIntField(term279592, term279592.getClass(), "ext10", 0);
        setField(term279592, term279592.getClass(), "extStr1", null);
        setField(term279592, term279592.getClass(), "extStr2", null);
        setLongField(term279592, term279592.getClass(), "extLong1", 0L);
        setLongField(term279592, term279592.getClass(), "extLong2", 0L);
        setField(term279592, term279592.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term279592, term279592.getClass(), "isNetBattleHost", false);
        setIntField(term279592, term279592.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term279592, args);
    }

};


